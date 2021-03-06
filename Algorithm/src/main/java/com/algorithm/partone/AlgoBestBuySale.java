package com.algorithm.partone;

public class AlgoBestBuySale {

    public static void main(String[] args) {

        int[] price = {4, 3, 7, 1, 6, 5, 2};
        getBestBS(price);
    }

    private static void getBestBS(int[] price) {

        if (price == null || price.length == 0) return;

        int min = price[0];
        int profit = 0;
        int buyDay = 1;
        int saleDay = 1;

        for (int i = 1; i < price.length; i++) {

            if (min > price[i]) {
                min = price[i];
                buyDay = i;
            } else {
                if (profit < price[i] - min) {
                    profit = price[i] - min;
                    saleDay = i;
                }
            }

        }

        System.out.println("the profit is " + profit);
        System.out.println("the best buy day is " + (buyDay + 1));
        System.out.println("the best sale day is " + (saleDay + 1));
    }

}
