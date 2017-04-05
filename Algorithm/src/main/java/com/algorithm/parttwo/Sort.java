package com.algorithm.parttwo;

/**
 * Created by Jonathan on 2017/4/5.
 * This class / file is used for...
 */
public class Sort {


    public static void main(String[] args) {
        int[] array = {3, 5, 7, 2, 1, 4, 6};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] numbers) {


        if (numbers == null || numbers.length == 0) {
            return;
        }

        int length = numbers.length;

        for (int i = 0; i < length - 1; i++) {


            for (int j = i + 1; j < length; j++) {

                int tmp1 = numbers[i];
                int tmp2 = numbers[j];
                if (tmp1 > tmp2) {
                    numbers[i] = tmp2;
                    numbers[j] = tmp1;

                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
