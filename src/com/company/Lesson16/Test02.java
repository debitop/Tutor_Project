package com.company.Lesson16;

/**
 * Created by Саша on 13.12.2016.
 */
/* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/
public class Test02 {
    public static void main(String[] args) {
       metod3();


    }
    private static void metod3(){
        metod2();
    }
    private static void metod2(){
        metod1();
    }
    private static void metod1(){

        StackTraceElement[]elements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement element : elements) {
        count++;
            System.out.println(element.getMethodName());
        }

        System.out.println(count);
    }
}
