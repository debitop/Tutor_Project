package com.company.Lesson29.Task01;

/**
 * /* Лошадь и пегас
 Написать два класса: Horse (лошадь) и Pegas (пегас).
 В классе Horse создать переменные name, flyable, runnable
 Созать конструктор для всех переменных класса Horse
 В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
 - если переменная true, My name is + this.name + , i can fly =)
 - если переменная false, My name is + this.name + , i cant fly =(
 Унаследовать пегаса от лошади.
 В методе main создать два объекта: horse и pegas
 Подумать, какие значения присваивать переменным определенного класса.
 */
public class Test01 {
    public static void main(String[] args) {
        Horse horse = new Horse("Стрела", false, true);
        Horse pegas = new Pegas("Kот", true, false);
        horse.checkFly();
        pegas.checkFly();
    }
}
