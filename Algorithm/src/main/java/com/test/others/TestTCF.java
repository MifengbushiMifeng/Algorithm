package com.test.others;

public class TestTCF {

    public static void main(String[] args) {

        String aStr = "1";
        aStr = getTCF(aStr);
        System.out.println("main " + aStr);
    }

    private static String getTCF(final String str) {
        String tmp = null;
        try {
            tmp = str + 1;
            System.out.println("sub1 " + str);
            System.out.println("sub2 " + tmp);
            
            return tmp;
        } catch (Exception e) {
            System.out.println("0");
        } finally {
            tmp = tmp + "2";
            System.out.println("sub3" + tmp);
        }

        return tmp;
    }

}
