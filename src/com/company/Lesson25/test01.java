package com.company.Lesson25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 12.03.2017.
 */

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

map.put("Rooney", "Leo");
map.put("Lloris", "Hugo");
map.put("Messi", "Leo");
map.put("Ronaldo", "Cristiano");
map.put("Maldini", "Paolo");
map.put("Indzaghi", "Pipo");
map.put("Del Piero", "Alesandro");
map.put("Balotelli", "Mario");
map.put("Gotze", "Mario");
map.put("Gomez", "Mario");
*/

public class test01 {
    public static void main(String[] args) {
        Map<String,String>map = makeMap();
        delMap(map);
    }
    private static Map<String,String> makeMap(){
        Map<String,String>map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
       return map;
    }
    private static void delMap(Map<String,String> map){
//        Iterator<Map.Entry<String,String>>iterator = map.entrySet().iterator();
//        while (iterator.hasNext()){
//            Map.Entry<String,String>pair = iterator.next();
//            String value =pair.getValue();
//
//      }
        Map<String,String>newMap = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count=0;
            for (String s : map.values()) {
                if (s.equals(entry.getValue())) {
                    count++;
                }
            }
            if (count==1) {
                newMap.put(entry.getKey(),entry.getValue());
            }

        }
        for (Map.Entry<String, String> newEntry : newMap.entrySet()) {
            System.out.println(newEntry.getKey() + " - " + newEntry.getValue());
        }
    }
}
