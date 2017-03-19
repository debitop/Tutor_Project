package com.company.Lesson05_Cycle;

/**
 * Created by Саша on 06.11.2016.
 */
/*
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
8888888888
8
8
8
8
8
8
8
8
8
8
*/
public class TestCycle08 {
    public static void main(String[] args) {
        for (int i = 0; i<10; i++){
            System.out.print("8");
        }
        System.out.println();
        for (int i = 0;i<10; i++){
            System.out.println("8");
        }
    }
}
