package com.company.Lesson50;

import java.util.HashMap;
import java.util.Map;

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
        addfio(map);
        map=dellcopy(map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }

    static Map<String, String> map2 = new HashMap<>();

    static void addfio(Map<String, String> map) {
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

    static Map<String, String> dellcopy(Map<String, String> map) {
        //     Map<String,String>map2=new HashMap<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {

            int cap = 0;
            String perem = entry.getValue();
            for (String s : map.values()) {
                if (perem.equals(s)) {
                    cap++;
                }
            }
            if (cap == 1) {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }
}
