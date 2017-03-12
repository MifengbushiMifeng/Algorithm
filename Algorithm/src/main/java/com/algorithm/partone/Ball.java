package com.algorithm.partone;

public class Ball {

    /**
     * Jonathan ZHou
     * @param args
     */
    public static void main(String[] args) {
        // Testing
        double h = 100 / 2;
        double s = 100;
        for (int i = 0; i < 9; i++) {

            s = s + h * 2;
            h = h / 2;

        }
        System.out.println(s + " / " + h);
    }

    private boolean checkDifferent(String inString) {
        return !inString.matches(".*(.)");
    }

}
