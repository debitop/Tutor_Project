package com.company.Lesson12_TestList_Set_Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Саша on 29.11.2016.
 */
/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
При помощи метода  removeAllNumbersMoreThan10 удалить из множества все числа больше 10.
*/
public class Test02_Set_del_numbers_bolshe10 {
    public static void main(String[] args) {
        Set<Integer>set =new HashSet<>();
        for (int i=0; i<20; i++) {
            set.add(i);
        }
        removeAllNumbersMoreThan10(set);
        for (Integer i : set) {
            System.out.println(i);
        }
    }
    private static Set removeAllNumbersMoreThan10 (Set<Integer> set){
        Iterator<Integer>iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next()>10) iterator.remove();
        }

//        for (Integer i : set) {
//            if (i>10) set.remove(i);
//        }
        return set;
    }
}
