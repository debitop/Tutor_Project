package com.company.Lesson08_ArrayList_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
//чётные числа добавлять в конец списка, нечётные – в начало
public class Test04 {
    public static void main(String[] args) throws IOException {
        List<Integer>list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            String s = reader.readLine();
            if (s.isEmpty()) break;
            int a = Integer.parseInt(s);
            if (a%2==0) list.add(a);
            else list.add(0,a);
        }
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
