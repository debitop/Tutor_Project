package com.company.Lesson14_numbers_SetAnimals_Chars_ClassFamily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Саша on 06.12.2016.
 */
/* Пять наибольших чисел
Создать массив на 10 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/
public class Test04_Sortirovka_numbers {
    public static void main(String[] args) throws IOException {
        Integer[] array = createMas();
        sort1(array);
        for (int i = 0; i < 5; i++) System.out.println(array[i]);


    }

    private static Integer[] createMas() throws IOException {
        Integer[] array = new Integer[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }

    private static void sort(Integer[] array5) {
        for (int i = 0; i < array5.length - 1; i++) {
            for (int j = 0; j < array5.length - 1 - i; j++) {
                if (array5[j] < array5[j + 1]) {
                    int temp = array5[j];
                    array5[j] = array5[j + 1];
                    array5[j + 1] = temp;
                }
            }
        }
    }

    private static void sort1(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
}
