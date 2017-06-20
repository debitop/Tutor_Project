package com.company.Lesson42.Task02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 13.06.2017.
 */
// массив на 5 чисел и сортировку пузырьками.
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        sort(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }


    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int num1;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    num1 = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = num1;
                }
            }
        }
    }
}
