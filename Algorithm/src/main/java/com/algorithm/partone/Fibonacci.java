package com.algorithm.partone;

/**
 * Created by Jonathan on 2017/4/1.
 * This class / file is used for...
 */
public class Fibonacci {


    /**
     * The Fibonacci sequence is '1 1 2 3 5 8 13 21 34...'
     *
     * @param args args
     */
    public static void main(String[] args) {

        int result = getNthFibonacciSequence(15);
        System.out.println(result);

    }

    /**
     * Get the nTh value of the Fibonacci sequence
     *
     * @param nTh nTh of the Fibonacci number
     * @return the value of nTh Fibonacci number
     */
    private static int getNthFibonacciSequence(int nTh) {

        if (nTh == 1 || nTh == 2) {
            return 1;
        }

        int i = 1;
        int j = 1;
        int sum = 0;
        int currentFibonacci = 0;

        for (int k = 1; ; k++) {
            if (k == i + j) {
                j = i;
                i = k;
                sum = sum + 1;
            }

            if (sum == (nTh - 2)) {
                currentFibonacci = k;
                break;
            }
        }
        
        return currentFibonacci;
    }
}
