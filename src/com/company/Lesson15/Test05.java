package com.company.Lesson15;

/**
 * Created by Саша on 11.12.2016.
 */
/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода,
вызвавшего его, полученное с помощью StackTrace.
*/
public class Test05 {
    public static void main(String[] args) {
        metod1();
    }
    private static String metod1(){
        metod2();
        StackTraceElement[]elements = Thread.currentThread().getStackTrace();
        String name = elements[2].getMethodName();
        System.out.println(name);
        return name;
    }
    private static String metod2(){
        metod3();
        StackTraceElement[]elements = Thread.currentThread().getStackTrace();
        String name = elements[2].getMethodName();
        System.out.println(name);
        return name;
    }
    private static String metod3(){
        metod4();
        StackTraceElement[]elements = Thread.currentThread().getStackTrace();
        String name = elements[2].getMethodName();
        System.out.println(name);
        return name;
    }
    private static String metod4(){
        StackTraceElement[]elements = Thread.currentThread().getStackTrace();
        String name = elements[2].getMethodName();
        System.out.println(name);
        return name;
    }

}
