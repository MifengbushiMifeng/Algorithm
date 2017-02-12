package com.test.others;

import java.util.HashMap;
import java.util.Map;

public class SingletonThree {

    /**
     * �Ǽ�ʽ���� ����Spring����ķ�����������ע�ᣬ�´δ�����ֱ�ӻ�ȡ��
     * �Ǽ�ʽ����ʵ����ά����һ�鵥�����ʵ��������Щʵ�������һ��Map���ǼǱ����У������Ѿ��Ǽǹ���ʵ�������Mapֱ�ӷ��أ�����û�еǼǵģ����ȵǼ�
     * ��Ȼ�󷵻ء�
     */
    private static Map<String, SingletonThree> map = new HashMap<String, SingletonThree>();

    static {
        SingletonThree instance = new SingletonThree();
        map.put(instance.getClass().getName(), instance);
    }

    // ������Ĭ�Ϲ�����
    protected SingletonThree() {

    }

    // ��̬��������,��������Ωһ��ʵ��
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

    // һ��ʾ���Ե���ҵ����
    public String about() {
        return "Hello, I'm RegSingleton.";
    }

    public static void main(String[] args) {
        SingletonThree instance = getInstance(null);
        System.out.println(instance.about());
    }
}
