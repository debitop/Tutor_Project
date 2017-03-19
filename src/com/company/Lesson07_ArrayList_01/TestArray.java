package com.company.Lesson07_ArrayList_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 13.11.2016.
 */

public class TestArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // int[] list = new int[?];
        int n = list.size(); // list.length;
        list.add(45); // list[1] = 45; // Dobavlenie
        list.add(23); // [2]
        list.add(5);  // [3]
        list.add(0, 8); // [0]
        System.out.println(list.get(0));
        list.set(1, 200);
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println(list.get(2));
        System.out.println("------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
