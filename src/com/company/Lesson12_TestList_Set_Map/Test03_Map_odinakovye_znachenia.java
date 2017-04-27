package com.company.Lesson12_TestList_Set_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 29.11.2016.
 */
/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/
public class Test03_Map_odinakovye_znachenia {
    public static void main(String[] args) {
        Map<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "Sim"));
        System.out.println(getCountTheSameLastName(map, "Simn"));
        print(map);
    }
    private static void print (Map<String, String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }

    private static Map createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Sim1", "Simn");
        map.put("Sim", "Simn");
        map.put("Sim", "Arbusn");
        map.put("Baby", "Simn");
        map.put("Art", "Simn");
        map.put("Sim", "Simn");
        map.put("Eat", "Eatn");
        map.put("Food", "Foodn");
        map.put("Gevey", "Geveyn");
        map.put("Hugs", "Hugsn");
        return map;
    }

    private static int getCountTheSameFirstName(Map map, String first) {
        int countNames = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String>pair = iterator.next();
            String key =pair.getKey();
            if (key.equals(first)) countNames++;
        }
        return countNames;
    }
    private static int getCountTheSameLastName(Map map, String first) {
        int countNames = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String>pair = iterator.next();
            String value =pair.getValue();
            if (value.equals(first)) countNames++;
        }
        return countNames;
    }
}
