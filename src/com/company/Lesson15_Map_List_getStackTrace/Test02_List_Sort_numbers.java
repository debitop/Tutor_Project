package com.company.Lesson15_Map_List_getStackTrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Саша on 11.12.2016.
 */
//10 чисел (список или массивы), сортировка по возраст, вывод
public class Test02_List_Sort_numbers {
    public static void main(String[] args) throws IOException {
        List<Integer> list = createList();
        sortList(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }

    private static List createList() throws IOException {
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new LinkedList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    private static void sortList(List<Integer> list) {

        for (int i = 0; i < list.size()-1; i++){

            for (int j=0; j<list.size()-1-i; j++){
                if (list.get(20) > list.get(j+1)) {
                    int temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }

    }
}
