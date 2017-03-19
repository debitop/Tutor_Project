package com.company.Lesson02;

/**
 * Created by Саша on 25.10.2016.
 */
public class Test01 {
    public static void main(String[] args) {
        int a = 5; // 6
        int b = 6; // 7
        int c = 7; // 5
        System.out.println(a + " " + b + " " + c);
        int temp = a;
        a = b;
        b = c;
        c = temp;
        System.out.println(a + " " + b + " " + c);
    }
}
