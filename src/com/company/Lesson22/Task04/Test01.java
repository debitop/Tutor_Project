package com.company.Lesson22.Task04;

/**
 * Created by Саша on 22.01.2017.
 */
/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из:
«Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class Test01 {
    public static void main(String[] args) {
        metod(new Cow());
        metod(new While());
        metod(new Dog());
        metod(new Object());
    }

    public static void metod(Object o) {
        if (o instanceof Cow) {
            System.out.println("Корова");
        } else if (o instanceof While) {
            System.out.println("Кит");
        } else if (o instanceof Dog) {
            System.out.println("Собака");
        } else System.out.println("Неизвестное животное");
    }

    public static class Cow {
    }

    public static class While {
    }

    public static class Dog {
    }
}
