package com.test.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestForArrays {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // List<String> result = Arrays.asList(getList());
        List result = Arrays.asList(getList());
        System.out.println(result);
        result.addAll(result); // why there will be an exception?
        System.out.println(result);

    }

    private static List<String> getList() {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);
        return list;
    }
}
