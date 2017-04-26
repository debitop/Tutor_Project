package com.company.Lesson10_sortArray_Collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 22.11.2016.
 */
/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 10 чисел и выводит их в убывающем порядке.
*/
public class Test01_sort_Puzyrek {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array = new int[10];
        for (int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void sort(int[] arr){
        // Метод пузырька
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
