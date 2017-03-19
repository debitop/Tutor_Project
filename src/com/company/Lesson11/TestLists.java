package com.company.Lesson11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Саша on 27.11.2016.
 * [0] - [1] - [2] - [3] - ArrayList
 * []-[]-[]-[]-[]-[]-[] - LinkedList
 */
/* Провести 10 тысяч вставок, удалений
Для arrayList и linkedList провести 10 тысяч вставок, удалений, а также вызовов get и set.
*/
public class TestLists {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new LinkedList();
        insert10000(list1);
        set10000(list1);
        get10000(list1);
        delete10000(list1);
        insert10000(list2);
        set10000(list2);
        get10000(list2);
        delete10000(list2);
    }
    public static void insert10000(List list){
        for (int i=0; i<10_000;i++) list.add(0, new Object());
    }
    public static void delete10000(List list){
        for (int i=0; i<list.size(); i++) list.remove(0);
    }
    public static void get10000(List list){
        for (int i =0; i<list.size(); i++) list.get(i);
    }
    public static void set10000 (List list){
        for (int i=0; i<list.size(); i++) list.set(i, new Object());
    }

}
