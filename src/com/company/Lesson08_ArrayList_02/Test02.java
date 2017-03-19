package com.company.Lesson08_ArrayList_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 15.11.2016.
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        int a = 5;

        if(a%2==0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        while(true){
            String s = reader.readLine();
            if(s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
