package com.company.Lesson11;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Саша on 27.11.2016.
 */
/* Измерить сколько времени занимает 10 тысяч вставок для каждого списка
Измерить, сколько времени занимает 10 тысяч вставок для каждого списка.
Метод getTimeMsOfInsert  должен вернуть время его исполнения в миллисекундах.
*/
public class TestLists02 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        System.out.println(getTimeMsOfInsert(list1));
        System.out.println(getTimeMsOfInsert(list2));

    }
    private static void insert10000 (List list){
for (int i=0; i<100000; i++) list.add(0, new Object());
    }
    private static long getTimeMsOfInsert(List list){
        Date date1 = new Date();
        insert10000(list);
        Date date2 = new Date();
        long time = date2.getTime()-date1.getTime();
        return time;
    }
}
