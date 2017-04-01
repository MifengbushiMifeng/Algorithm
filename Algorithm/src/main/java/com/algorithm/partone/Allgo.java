package com.algorithm.partone;

/**
 * Created by Jonathan on 2017/4/1.
 * This class / file is used for...
 */
public class Allgo {

    public static void main(String[] args) {

        int result = nThAllgo(13);
        System.out.println(result);
    }

    private static int nThAllgo(int nTh) {

        int nThAllgo = 0;
        int sum = 0;
        int currentnThAllgo = 2;

        for (int i = currentnThAllgo; ; i = i + 2) {

            int tmp = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    tmp = tmp + j;
                }
            }

            if (tmp > i) {
                sum = sum + 1;
                currentnThAllgo = i;
            }

            if (sum == nTh) {
                nThAllgo = currentnThAllgo;
                break;
            }

        }

        return nThAllgo;

    }

}