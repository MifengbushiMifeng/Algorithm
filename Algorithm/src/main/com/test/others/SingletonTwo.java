package com.test.others;

public class SingletonTwo {

    /**
     * ����ʽ������.�ڵ�һ�ε��õ�ʱ��ʵ�����Լ�
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
