package com.company.Lesson42.Task01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 11.06.2017.
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
public class Test01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        addName(map);
        map=removeDublicate(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }

    public static Map<String, String> removeDublicate(Map<String, String> map) {
        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int a = 0;
            String name = entry.getValue();
            for (String s : map.values()) {
                if (name.equals(s)) {
                    a++;
                }
            }
            if (a == 1) {
                newMap.put(entry.getKey(), entry.getValue());
            }

        }
        return newMap;
    }

    public static void addName(Map<String, String> map) {
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
    }
}
