package com.company.Lesson15;

/**
 * Created by Саша on 11.12.2016.
 */
/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/
public class Test04 {
    public static void main(String[] args) {
        metod1();
    }

    private static StackTraceElement[] metod1() {
        metod2();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;
    }

    private static StackTraceElement[] metod2() {
        metod3();
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;

    }

    private static StackTraceElement[] metod3() {
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        return elements;
    }
}
