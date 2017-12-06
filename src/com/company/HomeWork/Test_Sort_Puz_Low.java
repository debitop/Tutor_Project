package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;

public class Test_Sort_Puz_Low {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int num = 0;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    num = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = num;
                }
            }
        }

    }

}
