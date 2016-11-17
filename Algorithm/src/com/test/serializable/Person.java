package com.test.serializable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Externalizable {

    private static final long serialVersionUID = 1l;

    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    private String passWord;

    private String age;

    public Person(String userName, String passWord, String age) {
        this.userName = userName;
        this.passWord = passWord;
        this.age = age;
    }

    /**
     * 序列化操作的扩展类
     */
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        Date date = new Date();
        out.writeObject(userName);
        out.writeObject(passWord);
        out.writeObject(date);
    }

    /**
     * 反序列化的扩展类
     */
    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.userName = (String) in.readObject();
        this.passWord = (String) in.readObject();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = (Date) in.readObject();
        System.out.println("反序列化后的日期为:" + sdf.format(date));
    }

    @Override
    public String toString() {
        return "用户名:" + userName + "密 码:" + passWord + "年龄:" + age;
    }
}
