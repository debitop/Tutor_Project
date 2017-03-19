package com.company.Lesson22.Task01;

/**
 * Created by Саша on 22.01.2017.
 */
/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
*/
public class Whale extends Cow{
    public int x = 1;
    @Override
    void getName() {
        System.out.println("Я не корова, Я - кит");
    }
}
