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

    // �����ڲ��׳����쳣,���봦��,Ҫôtry catchҪôthrow
    public static void test1() {
        System.out.println("invoke test1");
        throw new IllegalArgumentException();
    }

    // uncheck exception,����ʱ����Ҫ����
    public static void test2() throws IllegalArgumentException {
        System.out.println("invoke test2");
    }

    // check exception,���õ�ʱ����벶��
    public static void test3() throws MyException {
        System.out.println("inovke test3");
    }
}
