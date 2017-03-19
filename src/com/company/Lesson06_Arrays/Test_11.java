package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.11.2016.
 */
/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с
текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
[0] = "text";
[0] = 4;
*/
public class Test_11 {
    public static void main(String[] args) throws IOException {
        String [] arrayS = new String[10];
        int [] arrayN = new int[10];
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<arrayS.length; i++){
            arrayS [i] = reader.readLine();
            arrayN [i] = arrayS[i].length();
        }
        for (int i=0; i<arrayN.length; i++){
            System.out.println(arrayS[i] + " - " + arrayN[i]);
        }
    }
}
