package com.company.Lesson29.Task01;

/**
 * Created by Саша on 26.03.2017.
 */

/**
 * /* Лошадь и пегас
 * Написать два класса: Horse (лошадь) и Pegas (пегас).
 * В классе Horse создать переменные name, flyable, runnable
 * Созать конструктор для всех переменных класса Horse
 * В классе Horse создать метод, который проверяет переменную flyable и выводит на экран следующее:
 * - если переменная true, My name is + this.name + , i can fly =)
 * - если переменная false, My name is + this.name + , i cant fly =(
 * Унаследовать пегаса от лошади.
 * В методе main создать два объекта: horse и pegas
 * Подумать, какие значения присваивать переменным определенного класса.
 */
public class Horse {
    String name;
    boolean flyable;
    boolean runnable;

    public Horse(String name, boolean flyable, boolean runnable) {
        this.flyable = flyable;
        this.name = name;
        this.runnable = runnable;
    }

    public void checkFly(){
        if (this.flyable){
            System.out.println("My name is " + this.name + ", i can fly =)");
        }
        else System.out.println("My name is " + this.name + ", i cant fly =)");
    }

}
