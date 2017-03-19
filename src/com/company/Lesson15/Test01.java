package com.company.Lesson15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 11.12.2016.
 */
/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/
public class Test01 {
    public static void main(String[] args) {
        Map<String,String> map = createMap();
        map = deleteMap(map);
        System.out.println(map);

    }
    private static Map createMap (){
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
    private static Map<String,String> deleteMap(Map<String,String> map){
        Map<String, String> copy_map = new HashMap<>(); //создание пустого Map

        Iterator<Map.Entry<String,String>>iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String>pair=iterator.next();
            String value = pair.getValue();
            String key = pair.getKey();
            int count = 0;
            for (String s : map.values()) {
                if (value == s) count++;

            }
            if (count == 1) copy_map.put(key, value);
        }
        return copy_map;

    }
}
