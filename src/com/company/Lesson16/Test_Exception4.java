package com.company.Lesson16;

/**
 * Created by Саша on 13.12.2016.
 */
/* Исключение при работе с массивами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int[] m = new int[2];
m[8] = 5;
*/
public class Test_Exception4 {
    public static void main(String[] args) {

        int[] m = new int[2];
        try {
            m[8] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
