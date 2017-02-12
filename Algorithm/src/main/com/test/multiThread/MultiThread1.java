package com.test.multiThread;

public class MultiThread1 extends Thread {

    /**
     * 
     * Run 启动多线程 此时结果很有规律，先第一个对象执行，然后第二个对象执行，并没有相互运行。在JDK的文档中可以发现，一旦调用start()方法，
     * 则会通过JVM找到run()方法
     * 
     * Start 这样程序可以正常完成交互式运行。那么为啥非要使用start();方法启动多线程呢？
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
