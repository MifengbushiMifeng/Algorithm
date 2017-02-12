package com.test.others;

public class SingletonZero {

    /**
     * 饿汉式单例类.在类初始化时，已经自行实例化
     * 
     */
    private SingletonZero() {

    }

    private static final SingletonZero instance = new SingletonZero();

    public SingletonZero getInstance() {
        return instance;
    }

}
