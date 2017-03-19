package com.company.Lesson08_ArrayList_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
public class Test07 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> listBig = new ArrayList<>();
        Collections.addAll(list1, 45, 34, 23, 65, -45);
        Collections.addAll(list2, 43, 37, 29, 5, -5);
        listBig.addAll(list1);
        listBig.addAll(list2);

        for (int i=0; i<listBig.size(); i++){
            System.out.print(listBig.get(i) + " ");

        }

    }
}
