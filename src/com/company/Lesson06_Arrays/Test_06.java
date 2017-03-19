package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.11.2016.
 */
// массив на 5 чисел и 5 вводов с клавиатуры
public class Test_06 {
    public static void main(String[] args) throws IOException {
        int [] array = new int [5];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
