package com.company.Lesson07_ArrayList_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 13.11.2016.
 */
/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Test05 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //     String s = "text";
        //     System.out.println(s.length());
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int n = list.get(0).length();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < n) n = list.get(i).length();

        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == n) System.out.println(list.get(i));
        }

    }
}
