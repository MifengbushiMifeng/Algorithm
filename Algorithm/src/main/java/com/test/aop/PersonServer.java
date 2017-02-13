package com.test.aop;

/**
 * Created by IBM on 2017/2/12.
 */
public interface PersonServer {

    public void save(String name);

    public void update(String name, Integer id);

    public String getPersonName(Integer id);
}
