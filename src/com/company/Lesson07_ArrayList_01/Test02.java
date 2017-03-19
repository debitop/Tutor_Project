package com.company.Lesson07_ArrayList_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 13.11.2016.
 */
/*
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++){
            list.add(reader.readLine());
        }

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
