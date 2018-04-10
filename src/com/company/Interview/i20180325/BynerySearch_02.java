package com.company.Interview.i20180325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BynerySearch_02 {
    public static void main(String[] args) {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = {1, 3, 55, 65, 77, 79, 112, 222, 335, 668};
        System.out.println(search(array, 55, 0, 9));

    }

    private static int search(int[] array, int number, int indexStart, int indexEnd) {
        int midIndex = (indexEnd - indexStart) / 2;
        if (array[indexStart + midIndex] < number) {
            return search(array, number, midIndex + 1, indexEnd);
        } else if (array[(indexStart) + midIndex] > number) {
            return search(array, number, indexStart, midIndex - 1);
        } else

            return indexStart+midIndex;
    }

}
