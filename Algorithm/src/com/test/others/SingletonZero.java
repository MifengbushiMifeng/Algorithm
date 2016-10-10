package com.test.others;

public class SingletonZero {

    /**
     * ����ʽ������.�����ʼ��ʱ���Ѿ�����ʵ����
     * 
     */
    private SingletonZero() {

    }

    private static final SingletonZero instance = new SingletonZero();

    public static SingletonZero getInstance() {
        return instance;
    }

}
