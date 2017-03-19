package com.company.Lesson05_Cycle;

/**
 * Created by Саша on 06.11.2016.
 */
/*
Используя цикл for вывести на экран чётные числа от 1 до 100 включительно.
Через пробел либо с новой строки.
*/
public class TestCycle03 {
    public static void main(String[] args) {
        for (int i=2; i<=100; i+=2){
            System.out.print(i + " ");
        }
    }
}
