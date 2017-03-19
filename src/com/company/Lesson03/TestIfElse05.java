package com.company.Lesson03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 30.10.2016.
 */
public class TestIfElse05 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        metod(num);
    }
    public static void metod (int a){
        if (a>=0) System.out.println(a*2);
        else System.out.println(a+1);

        }
    }

