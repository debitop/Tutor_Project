package com.company.Lesson29.Task04;

/**
 * Created by Саша on 29.03.2017.
 */
/*
Создать классы Pet, Cat, Dog
В классе Pet создать метод getChild(), который возвращает экземпляр класса Pet.
Переопределить метод getChild в классах Cat(кот) и Dog(собака), чтобы кот порождал кота, а собака – собаку.
*/
public class Cat extends Pet{
    @Override
    Cat getChild() {
        return new Cat();
    }
}
