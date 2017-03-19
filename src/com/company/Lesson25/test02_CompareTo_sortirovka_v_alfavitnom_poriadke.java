package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 12.03.2017.
 */
/* Задача по алгоритмам
Задача: Введи с клавиатуры 10 слов и выведи их в алфавитном порядке.
Ronaldo
Cristiano
Lloris
Hugo
Del
Piero
Alesandro
Maldini
Paolo
Indzaghi
*/
public class test02_CompareTo_sortirovka_v_alfavitnom_poriadke {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }
        sort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }

    private static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                String peremen = array[j];
                if (isGreaterThen(array[j], array[j + 1])) {
                    array[j] = array[j + 1];
                    array[j + 1] = peremen;

                }
            }
        }
    }

    private static boolean isGreaterThen(String s1, String s2) {
        return s1.compareTo(s2) > 0; //вернет True если s1>s2
    }
}
