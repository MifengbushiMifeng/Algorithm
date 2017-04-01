package com.algorithm.partone;

/**
 * Created by Jonathan on 2017/4/1.
 * This class / file is used for...
 */
public class Allgo {

    public static void main(String[] args) {

        
        for (int i = 2; i < 100; i = i + 2) {

            int tmp = 0;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    tmp = tmp + j;
                }
            }

            if (tmp > i) {
                System.out.println(i);
            }

        }


    }

}
