package com.company.Lesson21_OOP.Test04;

/**
 * Created by Саша on 17.01.2017.
 */
/* Создать классы Cat и Dog с параметрами name и speed
Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public abstract class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 120);
        Dog dog = new Dog("Арчик", 120);
        if (cat.isDogNear(dog.getSpeed())) System.out.println("The winner is: " + cat.getName());
        else if (dog.isCatNear(cat.getSpeed())) System.out.println("The winner is: "+ dog.getName());
        else System.out.println("No winner");
    }


}
