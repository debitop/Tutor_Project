package com.company.Interview.i20180325;
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

import java.util.HashMap;
import java.util.Map;

public class DelFromMap {
    public static void main(String[] args) {
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
        map=delFromMap(map);
        System.out.println(map);

    }

    private static Map<String, String> delFromMap(Map<String, String> map) {
        Map<String, String> map1 = new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int num = 0;
            String m = entry.getValue();
            for (String s : map.values()) {
                if (m.equals(s)) {
                    num++;
                }
            }
            if (num == 1) {
                map1.put(entry.getKey(), entry.getValue());
            }
        }
        return map1;
    }

}
