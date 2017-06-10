package com.company.Lesson24;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 07.03.2017.
 */
/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/
/*
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
 */
public class test03_sort_map {
    public static void main(String[] args) {
        Map<String, Date> map = input();
//        Map<String,Date> map1 = new HashMap<>();
//        input(map1);
map=del_summer(map);
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    private static Map<String, Date> input() {
        Map<String, Date> map = new HashMap<>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 5 1999"));
        map.put("Stallone2", new Date("JUNE 13 1996"));
        map.put("Stallone3", new Date("JUNE 1 1980"));
        map.put("Stallone4", new Date("JUNE 1 1980"));
        map.put("Stallone5", new Date("JUNE 1 1980"));
        map.put("Stallone6", new Date("JUNE 1 1980"));
        map.put("Stallone7", new Date("JUNE 1 1980"));
        map.put("Stallone8", new Date("DECEMBER 1 1980"));
        map.put("Stallone9", new Date("MARCH 1 1980"));
        return map;
    }

    private static Map<String,Date> del_summer(Map<String, Date> map) {
        Iterator<Map.Entry<String,Date>>iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Date>pair = iterator.next();
            Date value = pair.getValue();
            if (value.getMonth()==5 || value.getMonth()==6 || value.getMonth()==7){
                iterator.remove();
            }
        }
        return map;
    }


//    private static void input (Map<String,Date> map){
//        map.put("Stallone",  new Date("JUNE 1 1980"));
//        map.put("Stallone1", new Date("JUNE 5 1999"));
//        map.put("Stallone2", new Date("JUNE 13 1996"));
//        map.put("Stallone3", new Date("JUNE 1 1980"));
//        map.put("Stallone4", new Date("JUNE 1 1980"));
//        map.put("Stallone5", new Date("JUNE 1 1980"));
//        map.put("Stallone6", new Date("JUNE 1 1980"));
//        map.put("Stallone7", new Date("JUNE 1 1980"));
//        map.put("Stallone8", new Date("DECEMBER 1 1980"));
//        map.put("Stallone9", new Date("MARCH 1 1980"));
//    }

}
