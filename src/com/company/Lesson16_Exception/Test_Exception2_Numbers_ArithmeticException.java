package com.company.Lesson16_Exception;

/**
 * Created by Саша on 13.12.2016.
 */
/* Исключение при работе с числами
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
int a = 42 / 0;
*/
public class Test_Exception2_Numbers_ArithmeticException {
    public static void main(String[] args) {
       try {
           int a=42/0;
       }
       catch (ArithmeticException e) {
           System.err.println("Ошибка " + e);
           e.printStackTrace();
       }

        System.out.println("OK");
    }
}
