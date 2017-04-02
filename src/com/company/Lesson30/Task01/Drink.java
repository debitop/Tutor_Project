package com.company.Lesson30.Task01;

/**
 * Created by Саша on 02.04.2017.
 */
/* Пиво и кола
Создать интерфейс Drink и классы Cola и Beer
В интерфейсе Drink создай метод isAlcoholic();
Реализуй интерфейс Drink в классах Beer и Cola.
Создать метод print, который должен определить какой напиток пришел ему в параметрах, алкогольный или безалкогольный.
И вывести на экран соответствующую запись.
*/
public interface Drink {
//    public static final int age = 10;
//
//    public abstract void drinkable();
    boolean isAlcoholic();
}
