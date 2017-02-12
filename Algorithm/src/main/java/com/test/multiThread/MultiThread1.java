package com.test.multiThread;

public class MultiThread1 extends Thread {

    /**
     * 
     * Run �������߳� ��ʱ������й��ɣ��ȵ�һ������ִ�У�Ȼ��ڶ�������ִ�У���û���໥���С���JDK���ĵ��п��Է��֣�һ������start()������
     * ���ͨ��JVM�ҵ�run()����
     * 
     * Start �����������������ɽ���ʽ���С���ôΪɶ��Ҫʹ��start();�����������߳��أ�
     * 
     * @param args
     */

    public static void main(String[] args) {
        MultiThread1 thread1 = new MultiThread1("Thread 1");
        MultiThread1 thread2 = new MultiThread1("Thread 2");
        thread1.run();
        thread2.run();
        System.out.println("-----------------------------------");
        MultiThread1 threadA = new MultiThread1("Thread A");
        MultiThread1 threadB = new MultiThread1("thread B");
        threadA.start();
        threadB.start();
    }

    private String name;

    public MultiThread1(String name) {
        super();
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread start : " + this.name + " , i = " + i);
        }

    }

}
