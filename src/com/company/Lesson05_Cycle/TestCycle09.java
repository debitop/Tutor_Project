package com.company.Lesson05_Cycle;

/**
 * Created by Саша on 06.11.2016.
 */
/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/
public class TestCycle09 {
    public static void main(String[] args) {
        int a = 1;
        while (a<10){
            System.out.println();
            int b = 1;
            while (b<=10){
                System.out.print(a*b + " ");
                b++;
            }
            a++;
        }
    }
}
