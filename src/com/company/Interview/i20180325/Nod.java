package com.company.Interview.i20180325;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Nod {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println(nod(num1, num2));

    }

    static int nod(int num1, int num2) {
        int num = num1;
        for (int i = num1; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                num = i;
                break;
            }
        }
        return num;
    }
}
