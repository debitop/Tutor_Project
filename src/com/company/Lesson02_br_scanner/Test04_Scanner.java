package com.company.Lesson02_br_scanner;


import java.util.Scanner;

/**
 * Created by Саша on 25.10.2016.
 */

public class Test04_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        System.out.println(n);
        int y = scanner.nextInt();
        System.out.println(y*y);
    }
}
