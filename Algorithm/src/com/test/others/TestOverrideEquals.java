package com.test.others;

public class TestOverrideEquals {

    public static void main(String[] args) {
        TestOverrideEqualsDto dto1 = new TestOverrideEqualsDto();
        dto1.setUserID("001");
        dto1.setUserName("zhou rh");
        TestOverrideEqualsDto dto2 = new TestOverrideEqualsDto();
        dto2.setUserID("001");
        dto2.setUserName("zhou rh");
        System.out.println(dto1.equals(dto2));
    }

}
