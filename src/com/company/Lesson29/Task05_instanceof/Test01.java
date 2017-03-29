package com.company.Lesson29.Task05_instanceof;

/**
 * Created by Саша on 29.03.2017.
 */
/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/
public class Test01 {
    public static void main(String[] args) {
        Dog cat = new Cat();
       Dog dog = new Dog();
       Lamp lamp = new Lamp();
        checkClass(cat);
   //     checkClass(dog);
   //     checkClass(lamp);
    }

    static void checkClass(Object object) {
        if (object instanceof Cat) {
            System.out.println("кошка");
        }
        if (object instanceof Dog) {
            System.out.println("собака");
        }
        if (object instanceof Bird) {
            System.out.println("птица");
        }
        if (object instanceof Lamp) {
            System.out.println("лампа");
        }
    }

    static class Cat extends Dog{
    }

    ;

    static class Dog {
    }

    ;

    static class Bird {
    }

    ;

    static class Lamp {
    }

    ;


}
