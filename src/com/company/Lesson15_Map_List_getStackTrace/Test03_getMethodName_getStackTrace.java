package com.company.Lesson15_Map_List_getStackTrace;

/**
 * Created by Саша on 11.12.2016.
 * LIFO - last in first out (Stack)
 *
 */
public class Test03_getMethodName_getStackTrace {
    public static void main(String[] args) {
        method1();
    }

    public static void method1(){
        method2();
    }

    public static void method2(){
        method3();
    }

    public static void method3(){
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element.getMethodName());
        }

    }
}
