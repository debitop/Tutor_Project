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

        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {

        }

    }
    public static void addName(Map<String,String> map){
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
