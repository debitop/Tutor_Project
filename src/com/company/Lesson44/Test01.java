package com.company.Lesson44;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 02.07.2017.
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        int[] num = zap();
        sort(num);
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }

    public static int[] zap() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        return num;
    }

    ;

    public static void sort(int[] num) {
        for (int i = 0; i < num.length-1; i++) {
            int a;
            for (int j = 0; j < num.length-1; j++) {
                if (num[j + 1] < num[j]) {
                    a = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = a;
                }
            }
        }
    }

    ;
}
