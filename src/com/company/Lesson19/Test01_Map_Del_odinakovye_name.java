package com.company.Lesson19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * Created by Саша on 08.01.2017.
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

public class Test01_Map_Del_odinakovye_name {
    public static void main(String[] args) {
        Map<String, String> map = addFamily();
        map = delFamily(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    private static Map<String, String> addFamily() {
        Map<String, String> map = new HashMap<>();
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

    private static Map<String, String> delFamily(Map<String, String> map) {
        Map<String, String> map2 = new HashMap<>();

        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            for (String s : map.values()) {

                if (s.equals(entry.getValue())) {
                    count++;
                }
            }
            if (count == 1) map2.put(entry.getKey(), entry.getValue());
        }


        return map2;
    }

}
