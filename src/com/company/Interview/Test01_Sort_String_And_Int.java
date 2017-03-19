package com.company.Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.01.2017.
 */
/* Задача по алгоритмам
        Задача: Пользователь вводит с клавиатуры список слов (и чисел). Слова вывести в возрастающем порядке, числа - в убывающем.
        Пример ввода:
        Вишня
        1
        Боб
        3
        Яблоко
        2
        0
        Арбуз
        Пример вывода:
        Арбуз
        3
        Боб
        2
        Вишня
        1
        0
        Яблоко
        */

public class Test01_Sort_String_And_Int {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        String[] strings = list.toArray(new String[list.size()]);
        sort(strings);
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

    }

    private static void sort(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            if (isNumber(strings[i])) {
                for (int j = 0; j < strings.length; j++) {
                    if (isNumber(strings[j])) {
                        String num = strings[j];
                        if (Integer.parseInt(strings[j]) < Integer.parseInt(strings[i])) {
                            strings[j] = strings[i];
                            strings[i] = num;
                        }
                    }
                }
            } else {
                for (int j = 0; j < strings.length; j++) {
                    if (!isNumber(strings[j])) {
                        if (isGreaterThen(strings[j], strings[i])) {
                            String s = strings[j];
                            strings[j] = strings[i];
                            strings[i] = s;

                        }
                    }
                }
            }
        }
    }

    private static boolean isGreaterThen(String a, String b) {
        return a.compareTo(b) > 0;
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
//второй метод определения число это или нет
    private static boolean isNumber1(String s) {
        if(s.length() == 0){return false;}

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if((i != 0 && c == '-') || (!Character.isDigit(c) && c != '-')){
                return false;
            }
        }
        return true;
    }
}
