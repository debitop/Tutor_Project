package com.company.Lesson06_Arrays;

/**
 * Created by Саша on 08.11.2016.
 */
//стат иниц 5 знач, минимум
public class Test_08 {
    public static void main(String[] args) {
        int [] arr = {13, 17, 4, 20, 2};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i]<min) min=arr[i];
        }
        System.out.println(min);
    }
}
