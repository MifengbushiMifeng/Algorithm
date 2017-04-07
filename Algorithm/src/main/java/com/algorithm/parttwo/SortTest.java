package com.algorithm.parttwo;

import org.junit.Test;

/**
 * Created by Jonathan on 2017/4/7.
 * This class / file is used for...
 */
public class SortTest {

    private static int[] array = {3, 5, 7, 2, 1, 4, 6};

    /**
     * Test method for quick method
     */
    @Test
    public void testQuickSort() {
        int[] sortArr = Sort.quickSort(array, 0, array.length - 1);
        for (int i = 0; i < sortArr.length; i++) {
            System.out.println(sortArr[i]);
        }
    }
}
