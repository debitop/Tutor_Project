package com.company.HomeWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test10_MapCompare4 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("cv", "ddddd");
        map.put("cvg", "ddggggggddd");
        map.put("cvf", "dddhhdd");

        Map<String, String> map1 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int a = map.get(o1).length() - map.get(o2).length();
                if (a == 0) {
                    return 1;
                } else return a;
            }
        });
        map1.putAll(map);
        for (Map.Entry<String, String> stringStringEntry : map1.entrySet()) {
            System.out.println(stringStringEntry);
        }

    }

}
