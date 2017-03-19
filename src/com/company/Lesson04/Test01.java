package com.company.Lesson04;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Реализовать метод closeToTen.
 * Метод должен выводить на экран ближайшее к 10 из двух чисел, записанных в аргументах метода.
 * Например, среди чисел 8 и 11 ближайшее к десяти 11.
 * Если оба числа на равной длине к 10, то вывести на экран любое из них.
 * Created by Саша on 01.11.2016.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        closeToTen(num1, num2);

    }

    public static void closeToTen(int a, int b) { // 3 20
        int closA = modul(10 - a); // 7
        int closB = modul(10 - b); // -10
        if (closA > closB) {
            System.out.println("ближе " + b);
        } else System.out.println("ближе " + a);
    }

    public static int modul (int a){
        if (a<0) {
            a = a*(-1);
            return a;
        } else return a;
    }
}
