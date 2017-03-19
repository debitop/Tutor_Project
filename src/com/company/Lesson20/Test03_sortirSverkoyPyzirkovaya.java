package com.company.Lesson20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 10.01.2017.
 */
//Сортировка слов в алфавитном порядке
//Сортировка методом сверки пузырьковая
public class Test03_sortirSverkoyPyzirkovaya {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reader.readLine();
        }
        sort1(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }

    private static void sort(String[] sort) {
        for (int i = 0; i < sort.length; i++) {
            for (int j = 0; j < sort.length; j++) {
                if (isGreaterThen(sort[j], sort[i])) {
                    String s = sort[j];
                    sort[j] = sort[i];
                    sort[i] = s;

                }
            }
        }
    }

    private static void sort1(String[] sort) {
        for (int i = 0; i < sort.length - 1; ) {
            int j = i + 1;
            if (isGreaterThen(sort[j], sort[i])) {
                String s = sort[j];
                sort[j] = sort[i];
                sort[i] = s;
                if(i > 0) i--;
            } else {
                i++;
            }

        }
    }

    public static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }
}
