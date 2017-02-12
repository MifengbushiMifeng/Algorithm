package com.test.superTest;

public class SuperTest {

    /**
     * Comes from effective Java
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Child c = new Child();
        Child c = new Child();
        c.addAll();
    }
}

class Parent {
    public void add() {
        System.out.println("A add...");
    }

    public void addAll() {
        System.out.println("A add All...");
        this.add();
    }
}

class Child extends Parent {
    @Override
    public void add() {
        System.out.println("B all...");
        super.add();
    }

    @Override
    public void addAll() {
        System.out.println("B all All...");
        super.addAll();
    }
}