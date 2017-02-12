package com.test.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainTestForStu {

    public static void main(String[] args) throws ClassNotFoundException {

        try {
            FileOutputStream fos = new FileOutputStream("D:\\HOME\\seri\\test.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            Student s1 = new Student("Tim", "1234");
            Student s2 = new Student("Mark", "5555");
            oos.writeObject(s1);
            oos.writeObject(s2);

            // close stream
            oos.close();
            fos.close();

            FileInputStream fis = new FileInputStream("D:\\HOME\\seri\\test.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s3 = (Student) ois.readObject();
            Student s4 = (Student) ois.readObject();
            System.out.println("s3 : " + s3.toString());
            System.out.println("s4 : " + s4.toString());

            // close stream
            fis.close();
            ois.close();
        } catch (IOException e) {

        } finally {

        }
    }

}
