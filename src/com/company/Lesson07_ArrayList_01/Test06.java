package com.company.Lesson07_ArrayList_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 13.11.2016.
 */
/* 10 строчек в начало списка
1. Создай список строк в методе main.
2. Добавь в него 5 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

public class Test06 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
            list.add(0, reader.readLine());
        }
        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
