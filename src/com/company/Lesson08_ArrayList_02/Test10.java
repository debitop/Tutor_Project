package com.company.Lesson08_ArrayList_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/
public class Test10 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String>list = new ArrayList<>();
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        for (int i=0; i<n; i++){
            list.add(reader.readLine());
        }
        for (int i=0; i<m; i++){
            String s = list.remove(0);
            list.add(s);
        }
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }



    }
}
