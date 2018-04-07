package com.company.Interview.i20180325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//поиск индекса в сортированном массиве
public class BynerySearch {
    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {2, 6, 9, 44, 66, 143, 267, 345, 477, 532};

        System.out.println(search(arr, 532, 0, arr.length - 1));
    }

    private static int search(int[] arr, int number, int startIndex, int endIndex) {
        int index = startIndex+(endIndex - startIndex) / 2;
        if (arr[index] < number) {
            return search(arr, number, index + 1, endIndex);
        } else if (arr[index] > number) {
            return search(arr, number, startIndex, index - 1);
        } else {
            return index;
        }

    }
}

