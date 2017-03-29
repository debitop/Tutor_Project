package com.company.Lesson29.Task06;

/**
 * Created by Саша on 29.03.2017.
 */
/* Или «Корова», или «Кит», или «Собака», или «Неизвестное животное»
Написать метод, который определяет, объект какого класса ему передали, и возвращает результат – одно значение из: «Корова», «Кит», «Собака», «Неизвестное животное».
*/
public class Test01 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Whale whale = new Whale();
        Dog dog = new Dog();
        Animals animals = new Animals();
        checkObject(cow);
        checkObject(whale);
        checkObject(dog);
        checkObject(animals);


    }
    static void checkObject(Object object){
        if (object instanceof Cow){
            System.out.println("корова");
        }
        if (object instanceof Whale){
            System.out.println("кит");
        }
        if (object instanceof Dog){
            System.out.println("собака");
        }
        if (object instanceof Animals){
            System.out.println("неизвестное животное");
        }
    }
    static class Cow{};
    static class Whale{};
    static class Dog{};
    static class Animals{};
}
