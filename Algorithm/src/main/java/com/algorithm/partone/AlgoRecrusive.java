package com.algorithm.partone;

import java.util.ArrayList;
import java.util.List;

public class AlgoRecrusive {

    /**
     * 
     * 求给出的字符串所有可能的排列组合 input like a b c output / like abc acb cab cba bca bac
     * 
     * @param args
     */
    public static void main(String[] args) {

        String base = "ABCD";
        List<String> resultList = list(base, "");
        System.out.println(resultList.size() + " / " + resultList);

    }

    private static List<String> list(String base, String buff) {
        List<String> resultList = new ArrayList<String>();

        if (base.length() <= 0) {
            resultList.add(buff);
        }

        for (int i = 0; i < base.length(); i++) {
            List<String> temp = new ArrayList<String>();
            temp = list((new StringBuilder(base).deleteCharAt(i)).toString(), buff + base.charAt(i));
            resultList.addAll(temp);
        }

        return resultList;
    }

}
