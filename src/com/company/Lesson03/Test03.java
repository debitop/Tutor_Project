package com.company.Lesson03;

/**
 * Created by Саша on 30.10.2016.
 */
public class Test03 {
    public static void main(String[] args) {
        int a = sum(10, 15);
        double b = del(100, 3.5);
        int c = min(40, 25);
        int d = multi(30, 4);
        System.out.printf("%d %.02f   %d %d", a, b, c, d);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double del(double a, double b) {
        return a / b;
    }

    public static int min(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }
}
