package com.company.Lesson05_Cycle;

/**
 * Created by Саша on 06.11.2016.
 */
/*
Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
Пример:
8
88
888
...
*/
public class TestCycle07 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            System.out.println();
            for (int j=0; j<i; j++){
                System.out.print("8");
            }
        }
    }
}
