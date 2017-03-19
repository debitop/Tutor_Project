package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 30.10.2016.
 */
public class TestIfElse04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        checkInterval(num);
    }
    public static void checkInterval (int a){
        if (a>50 && a<100) System.out.println("Число "+ a + " содержится в интервале");
        else  System.out.println("Число "+ a + " не содержится в интервале");

    }
}
