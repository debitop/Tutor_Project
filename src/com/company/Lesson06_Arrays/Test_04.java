package com.company.Lesson06_Arrays;

/**
 * Created by Саша on 08.11.2016.
 */
//Заполнение массива из 10 чисел, числами от 10 до 1:
public class Test_04 {
    public static void main(String[] args) {
        int [] array = new int[10];
        for (int i=0; i<array.length; i++){
            array[i] = 10-i;
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }

    }
}
