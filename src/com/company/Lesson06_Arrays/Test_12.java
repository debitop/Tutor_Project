package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.11.2016.
 */
/* Массив из чисел в обратном порядке
1. Создать массив на 5 чисел.
2. Ввести с клавиатуры 5 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/
public class Test_12 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[5];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<array.length; i++){
            array[i]=Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i<array.length; i++){
            System.out.println(array[array.length-1-i]);
        }
    }
}
