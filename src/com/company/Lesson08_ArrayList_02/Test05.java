package com.company.Lesson08_ArrayList_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
//Вводить числа и добавлять в список. Удалить со списка все значение больше 5.
public class Test05 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }

        for (int i=0; i<list.size();){
            if (list.get(i)>5){
                list.remove(i);
            }else i++;
        }

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
