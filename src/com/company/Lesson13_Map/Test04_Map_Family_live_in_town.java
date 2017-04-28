package com.company.Lesson13_Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Саша on 04.12.2016.
 */
/*
Задача: Программа определяет, какая семья (фамилию) живёт в указанном городе.
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/
public class Test04_Map_Family_live_in_town {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Map<String,String>map = createMap();
        findMap(map);

    }
    private static Map createMap() throws IOException {
         Map<String,String>map = new HashMap<>();
         while (true){
             String s = reader.readLine();
             if (s.isEmpty()) break;
             map.put(s,reader.readLine());
         }

        return map;
    }

    private static void findMap(Map<String,String> map) throws IOException {
        String s2 =reader.readLine();
        System.out.println(map.get(s2));
    }

}
