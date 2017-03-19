package com.company.Lesson08_ArrayList_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
//Разделение массива на два – чётных и нечётных чисел
public class Test06 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }

        for (int i=0; i<list.size(); i++){
            if (list.get(i)%2==0) list2.add(list.get(i));
            else list3.add(list.get(i));
        }

        for (int i=0; i<list2.size(); i++){
            System.out.println(list2.get(i));
        }

//        for(Integer a : list){
//            if (a%2==0) list2.add(a);
//            else list3.add(a);
//        }
    }
}
