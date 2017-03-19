package com.company.Lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 22.11.2016.
 */
public class Test06 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("first", "1");
        map.put("first1", "2");
        map.put("first2", "3");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
