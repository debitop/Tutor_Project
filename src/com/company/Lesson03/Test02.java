package com.company.Lesson03;

/**
 * Created by Саша on 30.10.2016.
 */
public class Test02 {
    public static void main(String[] args) {
        int c = sum(34, 564);
        System.out.println(c);
        System.out.println(sum(5, 8));
        System.out.println(sum(545, 834));
        sum1(45, 5);
    }

    public static int sum (int a, int b){
        return a + b;
    }

    public static void sum1 (int a, int b){
        int c = a + b;
        System.out.println(c);
    }



}
