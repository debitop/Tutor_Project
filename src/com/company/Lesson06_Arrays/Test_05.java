package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.11.2016.
 */
//массив на 5 строк и заполнить с клавиатуры
public class Test_05 {
    public static void main(String[] args) throws IOException {
        String [] array = new String[5];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i<array.length; i++){
            array[i] = reader.readLine();
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }


    }
}
