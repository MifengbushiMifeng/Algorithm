package com.test.serializable;

import java.io.Serializable;

public class Student implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3610513525753150416L;

    private String name;

    private transient String password;

    // private String password;

    private static int count = 0;

    public Student(String name, String password) {
        System.out.println("call constract function with param");
        this.name = name;
        this.password = password;
        count++;
    }

    @Override
    public String toString() {
        return "name = " + this.name + " / " + "password = " + this.password + " / " + "count is " + count;
    }
}
