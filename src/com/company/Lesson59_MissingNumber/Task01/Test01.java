package com.company.Lesson59_MissingNumber.Task01;

/**
 * You are given an array of n-1 integers and these integers are in the range of 1 to n.
 * There are no duplicates in array. One of the integers is missing in the array. Write an efficient code to find the missing integer.
 * Example:
 * I/P    [0, 1, 2, 4, ,6, 3, 7, 8]
 * O/P    5
 */
public class Test01 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 3, 7, 8};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sum2 = 0;
        for (int i = 0; i <= n; i++) {
            sum2 += i;
        }
        System.out.println(sum2-sum);
    }
}
