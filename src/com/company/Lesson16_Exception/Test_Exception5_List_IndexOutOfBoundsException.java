package com.company.Lesson16_Exception;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 13.12.2016.
 */
/* Исключение при работе с коллекциями List
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
ArrayList<String> list = new ArrayList<String>();
String s = list.get(18);
*/
public class Test_Exception5_List_IndexOutOfBoundsException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        try {
            String s = list.get(18);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
