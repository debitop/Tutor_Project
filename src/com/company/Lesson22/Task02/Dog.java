package com.company.Lesson22.Task02;

/**
 * Created by Саша on 22.01.2017.
 */
/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/
public class Dog extends Pet {
    @Override
    protected Dog getChild() {
        return new Dog();
    }
}
