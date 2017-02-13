package com.test.aop.impl;

import com.test.aop.PersonServer;

/**
 * Created by IBM on 2017/2/12.
 */
public class PersonServerImpl implements PersonServer {

    @Override
    public void save(String name) {
        System.out.println("This is save method");
    }

    @Override
    public void update(String name, Integer id) {
        System.out.println("This is update method");
    }

    @Override
    public String getPersonName(Integer id) {
        System.out.println("This is getPersonName method");
        return "Jonathan Zhou";
    }
}
