package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 30.10.2016.
 */
public class TestIfElse03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("число 1");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("число 2");
        int num2 = Integer.parseInt(reader.readLine());
        if (num1 > num2) {
            System.out.println("Максимальное " + num1);
        } else if (num1 == num2) {
            System.out.println("числа одинаковые");
        } else {
            System.out.println("Максимальное " + num2);
        }
    }

}
