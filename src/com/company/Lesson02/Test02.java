package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 25.10.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s1 = reader.readLine();
        System.out.println("String is " + s1);

        System.out.println("Enter number: ");
        String s = reader.readLine();
        int number1 = Integer.parseInt(s);
        System.out.println("Pow = " + (number1*number1));

        int number2 = Integer.parseInt(reader.readLine());
        double number3 = Double.parseDouble(reader.readLine());
        long number4 = Long.parseLong(reader.readLine());
    }
}
