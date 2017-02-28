package com.algorithm.partone;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class AlgoRecursive {

    /**
     * Input likes A,B,C
     * And Output likes ABC ACB BAC BCS CAB CBA
     */
    public static void main(String[] args) {
        String base = "ABCD";
        List<String> resultList = list(base, "");
        System.out.println(resultList);

    }

    private static List<String> list(String base, String buffer) {

        List<String> resultList = new ArrayList<String>();
        if (base.length() <= 0) {
            resultList.add(buffer);
        }

        for (int i = 0; i < base.length(); i++) {
            List<String> tmp = new ArrayList<String>();
            tmp = list((new StringBuilder(base)).deleteCharAt(i).toString(), buffer + base.charAt(i));
            resultList.addAll(tmp);
        }

        return resultList;
    }

}
