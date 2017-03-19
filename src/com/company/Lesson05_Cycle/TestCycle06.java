package com.company.Lesson05_Cycle;

/**
 * Created by Саша on 06.11.2016.
 */
/*
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в одной строке не разделять.
*/
public class TestCycle06 {
    public static void main(String[] args) {
        int i =0;
        while (i<10) {
            System.out.println();
            i++;
            int j =0;
            while ( j<10){
                System.out.print("S  ");
                j++;
            }
        }

    }
}
