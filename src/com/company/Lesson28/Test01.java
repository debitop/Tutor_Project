package com.company.Lesson28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 21.03.2017.
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
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) {
                for (int j = 0; j < array.length; j++) {
                    if (isNumber(array[j])) {
                        String perem = array[i];
                        if (Integer.parseInt(array[i]) > Integer.parseInt(array[j])) {
                            array[i] = array[j];
                            array[j] = perem;
                        }
                    }
                }
            } else {
                for (int j = 0; j < array.length; j++) {
                    if (!isNumber(array[j])) {
                        String perem = array[i];
                        if (isGreatherThen(array[j], array[i])) {
                            array[i] = array[j];
                            array[j] = perem;
                        }
                    }
                }
            }
        }
    }

    private static boolean isGreatherThen(String s1, String s2) {
        return s1.compareTo(s2) > 0;
    }

    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
