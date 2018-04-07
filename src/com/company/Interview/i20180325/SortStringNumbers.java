package com.company.Interview.i20180325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SortStringNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String str = reader.readLine();
            if (str.isEmpty()) {
                break;
            }
            list.add(str);
        }
        String[] strings = list.toArray(new String[list.size()]);
        sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }

    static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (isNumb(strings[i])) {
                for (int j = 0; j < strings.length - 1; j++) {
                    String a;
                    if (isNumb(strings[j])) {
                        if (Integer.parseInt(strings[j]) < Integer.parseInt(strings[i])) {
                            a = strings[i];
                            strings[i] = strings[j];
                            strings[j] = a;
                        }
                    }
                }
            } else
                for (int j = 0; j < strings.length; j++) {
                    String a;
                    if (isGreatherThen(strings[i], strings[j])) {
                        a = strings[i];
                        strings[i] = strings[j];
                        strings[j] = a;
                    }
                }
        }
    }

    private static boolean isGreatherThen(String one, String two) {
        return one.compareTo(two) > 0;
    }

    private static boolean isNumb(String string) {
        try {
            Integer.parseInt(string);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
