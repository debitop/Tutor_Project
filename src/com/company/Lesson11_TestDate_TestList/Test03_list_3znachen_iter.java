package com.company.Lesson11_TestDate_TestList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 27.11.2016.
 */
//List, 3 значения, пройти итератором
public class Test03_list_3znachen_iter {
    public static void main(String[] args) {
        List<String>list = new ArrayList<>();
        list.add("Арбуз");
        list.add("Груша");
        list.add("Тыква");
//        Iterator<String>iterator = list.iterator();
//        while (iterator.hasNext()){
//            String text = iterator.next();
//            System.out.println(text);
//        }
        //iter
        for (String s : list) {
            System.out.println(s);
        }
    }
}
