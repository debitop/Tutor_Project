package com.company.Lesson06_Arrays;

/**
 * Created by Саша on 08.11.2016.
 */ // 0[566] 1[0] 2[0] 3[556] 4[0]
public class Test_01 {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 566;
        array[3] = 556;
        int n = array.length;
        System.out.println(n);
        System.out.println(array[3] + array[0]);

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
