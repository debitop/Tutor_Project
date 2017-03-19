package com.company.Lesson25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Саша on 12.03.2017.
 *
 */

public class test03_sortirovka_Pyzyrek_numbers_down {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         Integer [] array = new Integer[10];
        for (int i=0; i<array.length; i++) {
            array[i]=Integer.parseInt(reader.readLine());
        }
//        sort(array);
        Arrays.sort(array, Collections.reverseOrder());
        for (int i : array) {
            System.out.println(i);
        }
    }
    private static void sort(int[]array){
        for (int i=0; i<array.length;i++){
            for (int j=0; j<array.length-1;j++){
                int perem = array[j];
                if (array[j]<array[j+1]){
                    array[j]=array[j+1];
                    array[j+1]=perem;
                }
            }
        }
    }
}
