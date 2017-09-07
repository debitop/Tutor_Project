package com.company.Lesson48.Task06_max_delitel_nod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        //int nod;

        System.out.println(nod(a, b));
    }

    static int nod(int a, int b) {
        int nod=0;
        if (a < b) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    nod = i;
                    return nod;
                }
            }
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    nod = i;
                    return nod;
                }
            }
        }


        return nod;
    }
}
