package com.company.Lesson11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Саша on 27.11.2016.
 */
//set, 3 значения и вывод итератором

public class Test02 {
    public static void main(String[] args) {
        Set<String>set = new HashSet<>();
        set.add("Арбуз");
        set.add("Яблоко");
        set.add("Груша");
        Iterator<String>iterator = set.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
