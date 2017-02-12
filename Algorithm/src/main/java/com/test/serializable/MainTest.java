package com.test.serializable;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainTest {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Person person = new Person("Test User", "12345", "33");
        System.out.println("Before serialize, the object is " + person.toString());
        // Do serialize
        Operate.doSerializable(person);
        // Do de-serialize
        Person rePerson = Operate.doDeSerializable();
        System.out.println("After de-serialize, the object is " + rePerson.toString());
    }

}
