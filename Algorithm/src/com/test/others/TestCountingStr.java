package com.test.others;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestCountingStr {

    public static void main(String[] args) {
        countingStr("I'm go to swimming");
    }

    private static void countingStr(final String str) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < str.length(); i++) {
            String s = str.substring(i, i + 1);
            set.add(s);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String tmpStr = (String) it.next();
            int k = 0;
            for (int j = 0; j < str.length(); j++) {
                if (tmpStr.equals(str.substring(j, j + 1))) {
                    k++;
                }
            }
            System.out.println(tmpStr + " is " + k);
        }
    }
}
