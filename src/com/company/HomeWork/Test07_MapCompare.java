package com.company.HomeWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test07_MapCompare {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "слово1jtrknh");
        map.put("щ", "слово5erg");
        map.put("в", "слово3tgt");
        map.put("г", "слово4erterwttwe");

        Map<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int res = map.get(o1).length() - map.get(o2).length();
                return res == 0 ? -1 : res;
            }
        });

        treeMap.putAll(map);

        for (Map.Entry<String, String> stringStringEntry : treeMap.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }

}
