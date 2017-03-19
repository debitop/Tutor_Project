package com.company.Lesson10;

import java.util.*;

/**
 * Created by Саша on 22.11.2016.
 * List - список ( ArrayList... )
 * Set - множество ( куча ) ( HashSet... )
 * Map - словарь ( ключ (уникальные) - значение ) ( HashMap... )
 */
public class Test03_Collections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("text");
        list.add("text");
        list.add("text1");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        Set<String> set = new HashSet<>();
        set.add("text");
        set.add("text");
        set.add("text1");
        set.add("text2");
        set.add("text3");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("----------------------");

        Map<String, String> map = new HashMap<>();
        map.put("ua", "ukraine");
        map.put("ua", "ukrain1e");
        map.put("ru", "russia");
        map.put("ru1", "russia");
        map.put("usa", "united state");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " " + value);
        }
    }
}
