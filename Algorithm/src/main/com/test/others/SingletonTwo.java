package com.test.others;

public class SingletonTwo {

    /**
     * 懒汉式单例类.在第一次调用的时候实例化自己
     * 
     */
    public SingletonTwo() {

    }

    private SingletonTwo instance = null;

    public SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }

        return instance;
    }
}
