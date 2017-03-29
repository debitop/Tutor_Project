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
public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 30);
        Dog dog = new Dog("Арчи", 34);
//        System.out.println(cat.isDogNear(dog));
//        System.out.println(dog.isCatNear(cat));
        if (cat.isDogNear(dog)) {
            System.out.println("скорость кота " + cat.getName() + " больше, чем скорость собаки " + dog.getName());
        } else System.out.println("скорость собаки " + dog.getName() + " больше, чем скорость кота " + cat.getName());

        System.out.println(cat.isDogNear(dog)
                ? "скорость кота " + cat.getName() + " больше, чем скорость собаки " + dog.getName()
                : "скорость собаки " + dog.getName() + " больше, чем скорость кота " + cat.getName());
    }
}
