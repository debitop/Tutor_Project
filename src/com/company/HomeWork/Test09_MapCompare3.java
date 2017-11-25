package com.company.HomeWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test09_MapCompare3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("d", "ddddddd");
        map.put("g", "ddddddhhhd");
        map.put("е", "ddddddhhрш");
        map.put("b", "ddddhhhhhhhddd");
        map.put("u", "ddddd");
        Map<String, String> tree = new TreeMap<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if ((map.get(o1).length() - map.get(o2).length())==0){
                    return -1;
                }
                return map.get(o1).length() - map.get(o2).length();

            }
        });

        tree.putAll(map);
        for (Map.Entry<String, String> stringStringEntry : tree.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }

}
