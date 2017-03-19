package com.company.Lesson16;

/**
 * Created by Саша on 13.12.2016.
 */
/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем
(количество элементов в списке). Это же число метод должен выводить на экран.
*/
public class Test01 {
    public static void main(String[] args) {
        metod1();

    }
    private static void metod1(){
        StackTraceElement[]elements = Thread.currentThread().getStackTrace();
        int count = 0;
        for (StackTraceElement element : elements) {
            System.out.println(element.getMethodName());
            count++;
        }
        System.out.println(count);
    }
}
