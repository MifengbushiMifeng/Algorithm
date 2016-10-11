package com.test.others;

public class TestFinalString {

    public void testString(String str) {
        str = "testStr";
    }

    public void testFinalString(final String str) {
        // str = "testStr"; Java complier will give an error
    }
}
