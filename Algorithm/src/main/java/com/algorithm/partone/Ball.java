package com.algorithm.partone;

/**
 * A ball drop from 100m, and will jump to the 50% of the origin height
 * to get the sum distance after 10 times.
 */
public class Ball {


    public static void main(String[] args) {

        double h = 100 / 2;
        double s = 100;

        for (int i = 0; i < 9; i++) {
            s = s + h / 2;
            h = h / 2;
        }

        System.out.println(s);
        System.out.println(h);

    }


}
