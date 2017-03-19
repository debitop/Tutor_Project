package com.company.Lesson07_ArrayList_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 13.11.2016.
 */
/* Один большой массив и два маленьких
1. Создать массив на 10 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 5 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[10];
        int[] ar = new int[5];
        int[] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < ar.length; i++) {
            ar[i] = array[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[5 + i];
        }
        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
