package com.test.others;

public class SingletonOne {

    private SingletonOne instance = null;

    public SingletonOne getInstance() {

        if (instance == null) {
            // TODO what's the difference?
            // synchronized (instance) {
            synchronized (SingletonOne.class) {
                if (instance == null) {
                    instance = new SingletonOne();
                }
            }
        }

        return instance;
    }

}
