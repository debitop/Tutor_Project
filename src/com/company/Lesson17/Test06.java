package com.company.Lesson17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by Саша on 18.12.2016.
 */
/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/
public class Test06 {
    public static void main(String[] args) {
        convertMapToSet(createMap());
    }
    private static class Cat{
        String name;

        public Cat(String name) {
            this.name = name;
        }
    }
    private static Map<String, Cat> createMap(){
        Map<String, Cat> map = new HashMap<>();
        map.put("кот1", new Cat("кот1"));
        map.put("кот2", new Cat("кот2"));
        map.put("кот3", new Cat("кот3"));
        map.put("кот4", new Cat("кот4"));
        map.put("кот5", new Cat("кот5"));

        return map;
    }
    private static void convertMapToSet(Map<String, Cat> map){
        Set<String>set = new HashSet<>();
        for (String s : map.keySet()) {
            set.add(s);
        }
        for (String s : set) {
            System.out.println(s);
        }
    }
}
