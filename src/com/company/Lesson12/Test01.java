package com.company.Lesson12;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Саша on 29.11.2016.
 */
/* Измерить сколько времени занимает 10 тысяч вызовов get для каждого списка
Измерить, сколько времени занимает 10 тысяч вызовов get для каждого списка.
Метод getTimeMsOfGet  должен вернуть время его исполнения в миллисекундах.
*/
public class Test01 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        add10000(list1);
        add10000(list2);
        System.out.println(getTimeMsOfGet(list1));
        System.out.println(getTimeMsOfGet(list2));


    }

    private static void add10000(List list) {
        for (int i = 0; i < 100000; i++) {
            list.add(new Object());
        }
    }

    private static void get10000(List list) {
        //int x = list.size() / 2;
         int x1 = (int) (Math.random() * 10000);
        for (int i = 0; i < 100000; i++) {
            list.get(i);
        }
    }

    private static long getTimeMsOfGet(List list) {
        Date date1 = new Date();
        get10000(list);
        Date date2 = new Date();
        long time = date2.getTime() - date1.getTime();
        return time;
    }
}
