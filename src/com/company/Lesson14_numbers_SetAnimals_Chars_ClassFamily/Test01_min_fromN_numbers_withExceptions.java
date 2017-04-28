package com.company.Lesson14_numbers_SetAnimals_Chars_ClassFamily;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 06.12.2016.
 */
/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/
public class Test01_min_fromN_numbers_withExceptions {
    public static void main(String[] args)  {
        List<Integer> list = null;
        try {
            list = getIntegerList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getMinimum(list));
    }

    private static List getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        return list;
    }

    private static int getMinimum(List<Integer> list) {
        int a = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < a) a = list.get(i);
        }
        return a;
    }
}
