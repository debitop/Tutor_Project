package com.company.Lesson10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Саша on 22.11.2016.
 */
public class Test05 {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("eee555555");
        list.add("rrrrrr");
        list.add("jjjjjjjj");
        Iterator<String>iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
    }
}
