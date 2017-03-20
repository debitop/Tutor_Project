package com.company.Lesson02_br_scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Саша on 25.10.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        System.out.println(s);
        int number = Integer.parseInt(reader.readLine());
        System.out.println(number*2);

    }
}
