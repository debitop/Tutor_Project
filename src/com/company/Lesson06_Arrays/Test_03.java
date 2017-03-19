package com.company.Lesson06_Arrays;

/**
 * Created by Саша on 08.11.2016.
 */
//Заполнение массива из 10 чисел, числами от 1 до 10
public class Test_03 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i = 0; i<array.length; i++){
            array [i] = i+1;
        }
        for (int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
