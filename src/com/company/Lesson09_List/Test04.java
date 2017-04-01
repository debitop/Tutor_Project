package com.company.Lesson09_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 20.11.2016.
 */
/* Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/
public class Test04 {
    public static void main(String[] args) throws IOException {
        List<String>list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        List<String>array = new ArrayList<>();
        for (String s : list) {
            if (s.length()%2==0) {
                array.add(s + " " + s);
            }
            else {
                array.add(s + " " + s + " " + s);
            }
        }
        for (String s : array) {
            System.out.println(s);
        }
    }
}
