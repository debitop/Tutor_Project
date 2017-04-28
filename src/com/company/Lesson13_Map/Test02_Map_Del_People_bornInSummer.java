package com.company.Lesson13_Map;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 04.12.2016.
 */
/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/
public class Test02_Map_Del_People_bornInSummer {
    public static void main(String[] args) {
        Map<String, Date>map =createMap();
        deleteMap(map);
        print(map);
    }

    private static Map createMap() {
        Map<String, Date> map = new HashMap<>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JULY 1 1980"));
        map.put("Stallone4", new Date("AUGUST 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
        return map;
    }
    private static void deleteMap(Map<String,Date> map){
        Iterator<Map.Entry<String,Date>>iterator =map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date> entry = iterator.next();
            if (entry.getValue().getMonth()>=5 && entry.getValue().getMonth()<=7) iterator.remove();
        }
     //   for (Map.Entry<String, Date> entry : map.entrySet()) {
     //       if (entry.getValue().getMonth()>=5 && entry.getValue().getMonth()<=7) map.remove(entry.getKey());
     //   }

    }
    private static void print(Map<String,Date> map){
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
