package com.company.Lesson04_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 01.11.2016.
 */
/* Сравнить имена

Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
        Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».*/

public class Test03_sravnit_names {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if (name1.equals(name2)) System.out.println("Имена идентичны");
        else if (name1.length() == name2.length()) System.out.println("Длины имен равны");
        else System.out.println("не равны");
    }
}
