package com.company.Lesson03;

/**
 * Created by Саша on 30.10.2016.
 */
public class Test05 {
    public static void main(String [] args){
        int a = 5;
        int b = 8;
        System.out.println(a + " " + b);
        swap(a, b);
    }

    public static void swap (int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println(a + " " + b);
    }
}
