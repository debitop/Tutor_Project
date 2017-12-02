package com.company.Lesson04_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 01.11.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        int num3 = Integer.parseInt(reader.readLine());
        if (num1>=num2 && num1>=num3) System.out.println("max " + num1);
        else if (num2>=num1 && num2>=num3) System.out.println("max " + num2);
        else System.out.println("max " + num3);


    }

}
