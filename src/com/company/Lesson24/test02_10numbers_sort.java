package com.company.Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 07.03.2017.
 */
/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 10 чисел и выводит их в убывающем порядке.
*/
public class test02_10numbers_sort {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int [] array = new int[10];
         for (int i=0; i<array.length; i++){
             array[i]=Integer.parseInt(reader.readLine());
         }

         for (int i=0; i<array.length-1;i++){

             for (int j=0; j<array.length-1; j++){
                 int a=array[j];
                 if (array[j+1]>array[j]) {
                     array[j]=array[j+1];
                     array[j+1]=a;
                 }
             }
         }
         for (int i=0; i<array.length; i++){
             System.out.println(array[i]);
         }
    }
}
