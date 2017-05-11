package com.company.Lesson17_Exception_02;

/**
 * Created by Саша on 18.12.2016.
 */
/* Деление на ноль
Создай метод public static void divisionByZero, в котором подели любое число на ноль и выведи на экран результат деления.
Оберни вызов метода divisionByZero в try..catch. Выведи стек-трейс исключения используя метод exception.printStackTrace()
*/
public class Test04_division_by_zero {
    public static void main(String[] args) {
        try {
            divisionByZero();
        }
        catch (ArithmeticException e) {
           e.printStackTrace();
        }


    }
    public static void divisionByZero(){
        System.out.println(5/0);
    }

}
