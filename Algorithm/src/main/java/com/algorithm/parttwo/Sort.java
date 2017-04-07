package com.algorithm.parttwo;

/**
 * Created by Jonathan on 2017/4/5.
 * This class / file is used for...
 */
public class Sort {


    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 1, 4, 6};

        // Bubble sort
        // bubbleSort(array);

        quickSort(array, 0, array.length - 1);


    }

    /**
     * @param numbers the array to be sorted
     * @param start   the start position
     * @param end     the end position
     */
    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            // the base value
            int base = numbers[start];
            int tmp;
            int i = start, j = end;
            do {
                while ((numbers[i] < base) && (i < end)) {
                    i++;
                }
                while ((numbers[j] > base) && (j > start)) {
                    j--;
                }

                if (i <= j) {
                    tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            if (start < j) {
                quickSort(numbers, start, j);
            }

            if (end > i) {
                quickSort(numbers, i, end);
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
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
