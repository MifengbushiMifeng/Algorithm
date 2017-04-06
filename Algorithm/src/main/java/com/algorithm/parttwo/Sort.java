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

        quickSort(array, 0, args.length);


    }

    /**
     * @param nums  the array to be sorted
     * @param start the start position
     * @param end   the end position
     */
    public static void quickSort(int[] nums, int start, int end) {

        if (start < end) {

            // the base value
            int base = nums[start];
            int tmp;
            int i = start, j = end;
            do {

                while ((nums[i] < base) && (i < end)) {
                    i++;
                }
                while ((nums[j] > base) && (j > start)) {
                    j--;
                }

                if (i <= j) {
                    tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            if (start < j) {
                quickSort(nums, start, j);
            }

            if (end > i) {
                quickSort(nums, i, end);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
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
