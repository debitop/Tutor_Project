package com.company.Lesson29.Task07;

/**
 * Created by Саша on 29.03.2017.
 */
/*
    Создать интерфейс Drink и класс AlcoholicBeer
    В интерфейсе Drink создай метод isAlcoholic();
    Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все нереализованные методы.
    Метод  toString в классе AlcoholicBeer должен выводить на экран "Напиток алкогольный", если isAlcoholic() возвращает true,
    иначе вывести на экран надпись "Напиток безалкогольный".
*/
public class AlcoholicBeer implements Drink{
    @Override
    public boolean isAlcoholic() {
        return true;
    }
    public String toString(){
        if (isAlcoholic()){
            return "напиток алкогольный";
        }
        else return "напиток безалкогольный";
    }
}
