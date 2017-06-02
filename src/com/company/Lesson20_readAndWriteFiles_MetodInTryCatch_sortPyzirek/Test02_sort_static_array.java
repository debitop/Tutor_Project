package com.company.Lesson20_readAndWriteFiles_MetodInTryCatch_sortPyzirek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 10.01.2017.
 */
//10 чисел в стат массив и сортируем в возраст порядке, выводим на экран.
public class Test02_sort_static_array {
    public static void main(String[] args) throws IOException {
        int [] array = new int[10];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         for (int i=0; i<array.length; i++){
             array[i]=Integer.parseInt(reader.readLine());
         }
         sort(array);
        for (int i : array) {
            System.out.println(i);
        }

    }
    private static void sort(int[] array){
        for (int i=0; i<array.length - 1; i++){
            for (int j=0; j<array.length-1-i;j++){
                if (array[j]>array[i]) {
                    int per = array[j];
                    array[j]=array[i];
                    array[i]=per;
                }
            }
        }
    }
}
