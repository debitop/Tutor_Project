package com.company.Lesson06_Arrays;

/**
 * Created by Саша on 08.11.2016.
 */
//стат иниц, 5 знач, их сумма
public class Test_07 {
    public static void main(String[] args) {
        int[] arr = {4, 6, 9, 3, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}
