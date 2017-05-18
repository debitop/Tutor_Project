package com.company.Lesson22_OOP_instanceOf_Interface.Task01_OOP_Cow_Whale;

/**
 * Created by Саша on 22.01.2017.
 */
/*
Создать 2 класса Сow и Whale.
В классе Cow создать метод getName(), который возвращает строку "Я - корова".
Унаследовать Whale от Cow
Переопределить метод getName в классе Whale(Кит), чтобы программа выдавала:
Я не корова, Я - кит.
public -> protected ->   -> private
*/
public class Cow {
    public int x = 2;
    void getName(){
        System.out.println("Я - корова");
    }
}
