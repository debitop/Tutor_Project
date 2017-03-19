package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.11.2016.
 */
/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
public class Test_10 {
    public static void main(String[] args) throws IOException {
        String [] array = new String[10];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length-2; i++){
            array[i] = reader.readLine();
        }

        for (int i = array.length-1; i >=0; i--){
            System.out.println(array[i]);
        }

//        for (int i = 0; i < array.length; i++){
//            int j = array.length - 1 - i;
//            System.out.println(array[j]);
//        }
    }
}
