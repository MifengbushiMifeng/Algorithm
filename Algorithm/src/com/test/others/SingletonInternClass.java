package com.test.others;

public class SingletonInternClass {
    // TODO totally don't understand
    private SingletonInternClass() {
    }

    /**
     * �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ���ʵ�� û�а󶨹�ϵ������ֻ�б����õ�ʱ�Ż�װ�أ��Ӷ�ʵ�����ӳټ��ء�
     */
    private static class SingletonHolder {
        /**
         * ��̬��ʼ��������JVM����֤�̰߳�ȫ
         */
        private static SingletonInternClass instance = new SingletonInternClass();
    }

    public static SingletonInternClass getInstance() {
        return SingletonHolder.instance;
    }

}
