package com.company.Lesson23_br_min;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 05.03.2017.
 */
public class test01 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int min=0;
         int a = Integer.parseInt(reader.readLine());
         int b = Integer.parseInt(reader.readLine());
         int c = Integer.parseInt(reader.readLine());
         if (a< b && a<c) min=a;
         else if (b<a && b<c) min =b;
         else min=c;
        System.out.println(min);
    }
}
