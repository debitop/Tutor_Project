package com.company.Lesson29.Task02;

/**
 * Created by Саша on 29.03.2017.
 */
/* Создать классы Cat и Dog с параметрами name и speed
Скрыть все внутренние переменные класса Cat и Dog.
 Также скрыть все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
 Создать метод isDogNear в классе Cat, который возвращает true, если скорость кота больше
 Создать метод isCatNear в классе Dog, который возвращает true, если скорость собаки больше
*/
public class Dog {
    private String name;
    private int speed;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    boolean isCatNear (Cat cat){
        if (cat.getSpeed()<this.speed) {
            return true;
        }
        else return false;
    }
}
