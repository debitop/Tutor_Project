package com.company.Lesson59_MissingNumber.Task01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//* Try to solve this challenge with linear complexity and using O(1) additional memory, since this is what you would be asked to do during a real interview.
//        You have an array a containing 2  n + 2 positive numbers, in which n numbers occur twice and two other numbers occur only once and are distinct.
//        * Find the two distinct numbers and return them in ascending order.
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 1, 4, 3, 6};
        int n = arr.length;
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        if (arr[0] != arr[1]) {
            list.add(arr[0]);
        }
        for (int i = 1; i < n - 1; i++) {
            if ((arr[i] != arr[i + 1]) && (arr[i] != arr[i - 1])) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}


