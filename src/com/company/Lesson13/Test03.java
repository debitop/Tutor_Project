package com.company.Lesson13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Саша on 04.12.2016.
 */
/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/
public class Test03 {
    public static void main(String[] args) throws IOException {
       Map<String,Integer>map =  createMap();
       searchMap(map);


    }
    private static Map createMap (){
        Map<String, Integer>map = new HashMap<>();
        map.put("January",1);
        map.put("February",2);
        map.put("March",3);
        map.put("April",4);
        map.put("May",5);
        map.put("June",6);
        map.put("July",7);
        map.put("August",8);
        map.put("September",9);
        map.put("October",10);
        map.put("November",11);
        map.put("December",12);
        return map;
    }
    private static void searchMap(Map<String, Integer> map) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int num = Integer.parseInt(reader.readLine());

         String mon = reader.readLine();
        System.out.println(mon +" is "+ map.get(mon) + " month");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()==num) System.out.println(entry.getKey() +" is "+ entry.getValue() + " month");
        }


    }
}
