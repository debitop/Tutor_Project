package com.company.Interview.i20180325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StringSort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String one = reader.readLine();
            if (one.isEmpty()) {
                break;
            }
            list.add(one);
        }
        String[] array = list.toArray(new String[list.size()]);
        sort(array);
    }

    private static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i < array.length - 1 - i; j++) {
                String a = array[j + 1];
                if (isGreaterThen(array[j + 1], array[j])) {
                    array[j + 1] = array[j];
                    array[j] = a;
                }

            }
        }
    }

    private static Boolean isGreaterThen(String one, String two) {
        return one.compareTo(two) > 0;
    }
}
