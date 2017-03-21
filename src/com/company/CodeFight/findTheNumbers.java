package com.company.CodeFight;

import java.util.Arrays;

/**
 * Created by Саша on 21.03.2017.
 */
/*
Try to solve this challenge with linear complexity and using O(1) additional memory,
since this is what you would be asked to do during a real interview.
You have an array a containing 2 * n + 2 positive numbers, in which n numbers occur twice and two
other numbers occur only once and are distinct. Find the two distinct numbers and return them in ascending order.

Example
For a = [1, 3, 5, 6, 1, 4, 3, 6], the output should be
findTheNumbers(a) = [4, 5];
For a = [4, 5, 6, 5, 3, 4], the output should be
findTheNumbers(a) = [3, 6].

 */
public class findTheNumbers {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 6, 1, 4, 3, 6};
        Arrays.sort(array);
        int[] newAraay = new int[2];
        for (int i = 0; i < array.length-1; i++) {
            int j = 0;
            if (array[i] != array[i + 1]) {

                newAraay[j] = array[i];
                j++;
            }
        }
        for (int i=0; i<2; i++){
            System.out.println(newAraay[i]);
        }
    }
}
