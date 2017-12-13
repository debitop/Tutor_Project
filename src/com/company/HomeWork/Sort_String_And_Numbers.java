package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//пока не ввели пустую строку - продолжаем вводить элементы
//вводим в лист, потом переводим в массив

// 2 1
//b  a
//1  2
//a  b
public class Sort_String_And_Numbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String a = reader.readLine();
            if (a.isEmpty()) break;
            else list.add(a);
        }
        String[] list2 = list.toArray(new String[list.size()]);
        sort(list2);
        for (int i = 0; i < list2.length; i++) {
            System.out.println(list2[i]);
        }

    }

    static boolean isNumber(String a) {
        try {
            Integer.parseInt(a);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    static boolean isGreatherThen(String a, String b) {
        return a.compareTo(b) > 0;

    }

    static void sort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (isNumber(str[i])) {
                for (int j = 0; j < str.length; j++) {
                    if (isNumber(str[j])) {
                        String a = str[i];
                        if (Integer.parseInt(str[j]) > Integer.parseInt(str[i])) {
                            str[i] = str[j];
                            str[j] = a;
                        }
                    }

                }

            } else {
                for (int j = 0; j < str.length; j++) {
                    if (!isNumber(str[j])) {
                        String a = str[i];
                        if (isGreatherThen(str[j], (str[i]))) {
                            str[i] = str[j];
                            str[j] = a;
                        }
                    }
                }
            }

        }

    }

}
