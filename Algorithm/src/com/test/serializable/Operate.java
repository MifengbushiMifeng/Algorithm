package com.test.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Operate {

    /**
     * ���л�����
     * 
     * @throws IOException
     * @throws FileNotFoundException
     */
    public static void doSerializable(Person person) throws FileNotFoundException, IOException {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\HOME\\seri\\a.txt"));
        outputStream.writeObject(person);
    }

    /**
     * �����л��ķ���
     * 
     * @throws IOException
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     */
    public static Person doDeSerializable() throws FileNotFoundException, IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\HOME\\seri\\a.txt"));
        return (Person) ois.readObject();
    }
}
