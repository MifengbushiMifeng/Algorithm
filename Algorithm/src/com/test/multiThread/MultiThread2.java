package com.test.multiThread;

public class MultiThread2 implements Runnable {

    public static void main(String[] args) {
        MultiThread2 thread1 = new MultiThread2("Thread A");
        MultiThread2 thread2 = new MultiThread2("Thread B");
        new Thread(thread1).start();
        new Thread(thread2).start();
    }

    private String name;

    public MultiThread2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("thread start £º" + this.name + ",i=" + i);
        }
    }

}
