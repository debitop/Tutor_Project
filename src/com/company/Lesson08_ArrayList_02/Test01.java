package com.company.Lesson08_ArrayList_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
            list.add(reader.readLine());
        }
        for (int i=0; i<13; i++){
            String newstring=list.remove(list.size()-1);
            list.add(0,newstring);
        }
        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
