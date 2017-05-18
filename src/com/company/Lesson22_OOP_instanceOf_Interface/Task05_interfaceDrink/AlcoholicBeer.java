package com.company.Lesson22_OOP_instanceOf_Interface.Task05_interfaceDrink;

/**
 * Created by Саша on 22.01.2017.
 */
/*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
    */
public class AlcoholicBeer implements Drink {

    @Override
    public boolean isAlcoholic() {
        return true;
    }


    public void toString(boolean a) {
        if (isAlcoholic()) {
            System.out.println("Напиток алкогольный");
        } else System.out.println("Напиток безалкогольный");

    }
}
