package com.test.multiThread;

public class MultiThreadSaleTktRunnable implements Runnable {

    public static void main(String[] args) {

        MultiThreadSaleTktRunnable thread = new MultiThreadSaleTktRunnable();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();

    }

    private int tkt = 10;

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            if (this.tkt > 0) {
                System.out.println("Sale tkt : ticiket " + this.tkt--);
            }
        }
    }
}
