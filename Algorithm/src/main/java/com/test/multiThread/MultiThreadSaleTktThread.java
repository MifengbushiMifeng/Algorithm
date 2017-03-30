package com.test.multiThread;

public class MultiThreadSaleTktThread extends Thread {

    public static void main(String[] args) {
        MultiThreadSaleTktThread thread1 = new MultiThreadSaleTktThread("Thread A");
        MultiThreadSaleTktThread thread2 = new MultiThreadSaleTktThread("Thread B");
        MultiThreadSaleTktThread thread3 = new MultiThreadSaleTktThread("Thread C");
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private int tkt = 10;

    private String name;

    public MultiThreadSaleTktThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.tkt > 0) {
                System.out.println(this.name + " / " + "sale tkt : ticiket = " + this.tkt--);
            }
        }
    }
}
