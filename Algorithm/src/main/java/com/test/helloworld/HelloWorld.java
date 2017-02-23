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

        String str1 = new StringBuffer("Computer").append("software").toString();
        System.out.println(str1 == str1);

    }

}
