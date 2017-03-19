package com.company.Lesson06_Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.11.2016.
 */
/* Максимальное среди массива на 10 чисел
1. В методе initializeArray():
1.1. Создайте массив на 10 чисел
1.2. Считайте с консоли 10 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива
*/
//
public class Test_09_max_metod_konsol {
    public static void main(String[] args) throws IOException {
        int[] array = initializeArray();
        System.out.println(max(array));
    }

   public static int[] initializeArray () throws IOException {
       int [] ar = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       for (int i = 0; i<ar.length; i++){
           ar[i] = Integer.parseInt(reader.readLine());
       }
       return ar;
   }
   public static int max(int[] arr){
       int maxNum = arr[0];
       for (int i = 0; i < arr.length; i++){
           if (arr[i]>maxNum) maxNum=arr[i];
       }
        return maxNum;
   }
}
