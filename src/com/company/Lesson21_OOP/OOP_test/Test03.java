package com.company.Lesson21_OOP.OOP_test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Created by Саша on 17.01.2017.
 * "t" - n, i
 * "t" - b
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Test01 t1 = new Test02("Jora");
        t1.setName("Kolya");
        System.out.println(t1.method1());
        System.out.println(t1.getName());
    }
}
