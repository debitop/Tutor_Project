package com.company.Lesson11_TestDate_TestList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 27.11.2016.
 */
// map, 3 ключа и вывод iterator'ом
public class Test01_map3key_iterator {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Арбуз", "ар");
        map.put("Яблоко", "яб");
        map.put("Груша", "гр");
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String>pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + "-" + value);
        }

    }
}
