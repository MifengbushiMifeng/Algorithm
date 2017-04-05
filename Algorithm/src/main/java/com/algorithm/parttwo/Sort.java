package com.algorithm.parttwo;

/**
 * Created by Jonathan on 2017/4/5.
 * This class / file is used for...
 */
public class Sort {


    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 1, 4, 6};

        // Bubble sort
        bubbleSort(array);


    }

    /**
     * Bubble Sort
     *
     * @param numbers the array to be sorted
     */
    public static void bubbleSort(int[] numbers) {

        if (numbers == null || numbers.length == 0) {
            return;
        }

        int length = numbers.length;
        int tmp;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i; j < length; j++) {

                if (numbers[i] > numbers[j]) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }

            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
