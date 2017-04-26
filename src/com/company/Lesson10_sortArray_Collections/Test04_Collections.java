package com.company.Lesson10_sortArray_Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Саша on 22.11.2016.
 */
public class Test04_Collections {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("text");
        set.add("text2");
        set.add("text3");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }
    }
}
