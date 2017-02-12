package com.test.exception;

public class TestException {

    public static void main(String[] args) {
        test1();
        test2();
        try {
            test3();
        } catch (MyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // 方法内部抛出的异常,必须处理,要么try catch要么throw
    public static void test1() {
        System.out.println("invoke test1");
        throw new IllegalArgumentException();
    }

    // uncheck exception,调用时候不需要捕获
    public static void test2() throws IllegalArgumentException {
        System.out.println("invoke test2");
    }

    // check exception,调用的时候必须捕获
    public static void test3() throws MyException {
        System.out.println("inovke test3");
    }
}
