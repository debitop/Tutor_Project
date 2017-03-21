package com.company.CodeFight;

import java.util.Arrays;

/**
 * Created by Саша on 21.03.2017.
 */
/*Given an array of integers, write a function that determines whether the array contains any duplicates.
Your function should return true if any element appears at least twice in the array, and it should return false if every element is distinct.

        Example
        For a = [1, 2, 3, 1], the output should be
        containsDuplicates(a) = true.
        There are two 1s in the given array.
        For a = [3, 1], the output should be
        containsDuplicates(a) = false.
        The given array contains no duplicates.
*/
public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5};
        System.out.println(containsDuplicates(array));
    }

    private static boolean containsDuplicates(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }

        }
        return false;
//for (int i=0; i<a.length; i++){
//    if (a[i])
//}
//        return true;
    }
}
