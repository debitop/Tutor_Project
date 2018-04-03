package com.company.Interview.i20180325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BubleSort {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String read = reader.readLine();
            if (read.isEmpty()) {
                break;
            }
            list.add(Integer.parseInt(read));

        }
        Integer[] array = list.toArray(new Integer[list.size()]);
        //   int[] array = list.toArray(list.size());
        sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    static void sort(Integer[] array) {
        int count = 0;
        Boolean flag = true;
        for (int i = 0; flag; i++) {
            flag = false;
            count++;
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j + 1] > array[j]) {
                    int num = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = num;
                    flag = true;
                }

            }
        }
        System.out.println("count " + count);

    }
}
