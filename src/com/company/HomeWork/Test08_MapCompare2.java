package com.company.HomeWork;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test08_MapCompare2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("g", "fffffhhhhhhhhhhff");
        map.put("h", "fffffggff");
        map.put("k", "fffbbbbbffff");
        map.put("q", "fffffff");
        Map<String, String> treemap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int num = map.get(o2).length() - map.get(o1).length();
                return num == 0 ? -1 : num;
            }
        }

        );
        treemap.putAll(map);
        for (Map.Entry<String, String> stringStringEntry : treemap.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }
}

class User1 implements Comparable {
    int age;

    public User1(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        int res = this.age - ((User1) o).age;
        return res == 0 ? -1 : res;
    }
}