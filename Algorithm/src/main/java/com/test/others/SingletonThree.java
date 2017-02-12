package com.test.others;

import java.util.HashMap;
import java.util.Map;

public class SingletonThree {

    /**
     * 登记式单例 类似Spring里面的方法，将类名注册，下次从里面直接获取。
     * 登记式单例实际上维护了一组单例类的实例，将这些实例存放在一个Map（登记薄）中，对于已经登记过的实例，则从Map直接返回，对于没有登记的，则先登记
     * ，然后返回。
     */
    private static Map<String, SingletonThree> map = new HashMap<String, SingletonThree>();

    static {
        SingletonThree instance = new SingletonThree();
        map.put(instance.getClass().getName(), instance);
    }

    // 保护的默认构造子
    protected SingletonThree() {

    }

    // 静态工厂方法,返还此类惟一的实例
    public static SingletonThree getInstance(String name) {
        if (name == null) {
            name = SingletonThree.class.getName();
            System.out.println("name == null" + "--->name=" + name);
        }

        if (map.get(name) == null) {
            try {
                map.put(name, (SingletonThree) Class.forName(name).newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return map.get(name);
    }

    // 一个示意性的商业方法
    public String about() {
        return "Hello, I'm RegSingleton.";
    }

    public static void main(String[] args) {
        SingletonThree instance = getInstance(null);
        System.out.println(instance.about());
    }
}
