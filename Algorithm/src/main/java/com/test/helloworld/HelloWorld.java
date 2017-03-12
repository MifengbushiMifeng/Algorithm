package com.test.helloworld;

/**
 * Created by zhourh on 2/20/2017.
 */
public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        testStringIntern();
    }


    private static void testStringIntern() {

        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

}
