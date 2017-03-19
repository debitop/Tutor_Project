package com.company.Lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 20.11.2016.
 */
/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.

*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String>list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        list = doubleValues(list);
        for (String s : list) {
            System.out.println(s);
        }
    }
    private static List<String> doubleValues(List<String> list){
        List<String>array = new ArrayList<>();
        for (String s : list) {
            array.add(s);
            array.add(s);
        }
        return array;
    }
}
