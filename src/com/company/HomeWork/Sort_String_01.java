package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sort_String_01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] massiv = new String[5];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = reader.readLine();
        }
        sort(massiv);
        for (int i=0;i<massiv.length; i++){
            System.out.println(massiv[i]);
        }

    }

    static void sort(String[] mas) {
        for (int i = 0; i < mas.length-1;) {
            if (isGreatherThen(mas[i + 1], mas[i])) {
                String a = mas[i + 1];
                mas[i + 1] = mas[i];
                mas[i] = a;
                if (i > 0) i--;
            }
            else i++;
        }
    }

    static boolean isGreatherThen(String a, String b) {
        if (a.compareTo(b) > 0) return true;
        return false;
    }


}
