package com.company.Lesson16_Exception;

/**
 * Created by Саша on 13.12.2016.
 */
/* Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();
*/
public class Test_Exception3_String_NullPointerException {
    public static void main(String[] args) {
        String s = null;
        try {


        String m = s.toLowerCase();
    }
    catch (NullPointerException e){
        System.out.println(e);
    }
    }
}
