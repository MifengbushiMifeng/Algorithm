package com.test.others;

public class TestEqualsHashCode {

    public static void main(String[] args) {

        String testStr1 = "sap";
        String testStr2 = "s" + "ap";
        System.out.println(testStr1.equals(testStr2));
        System.out.println(testStr1.hashCode());
        System.out.println(testStr2.hashCode());
    }

}
