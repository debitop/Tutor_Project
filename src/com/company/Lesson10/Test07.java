package com.company.Lesson10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Саша on 22.11.2016.
 */
/* HashMap из 4 пар
Создать коллекцию HashMap<String, String>, занести туда 4 пары строк:
арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
груша - фрукт
*/
public class Test07 {
    public static void main(String[] args) {
        Map<String, String>map =new HashMap<>();
        map.put("арбуз", "ягода");
        map.put("банан", "трава");
        map.put("вишня", "ягода");
        map.put("груша", "фрукт");
        Iterator<Map.Entry<String, String>> iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String>pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

