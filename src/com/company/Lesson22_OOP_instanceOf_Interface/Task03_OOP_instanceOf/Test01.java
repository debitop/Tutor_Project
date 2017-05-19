package com.company.Lesson22_OOP_instanceOf_Interface.Task03_OOP_instanceOf;


/**
 * Created by Саша on 22.01.2017.
 */
/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/
public class Test01 {
    public static void main(String[] args) {
        metod(new Cat());
        metod(new Dog());
        metod(new Bird());
        metod(new Lamp());

    }
    public static void metod(Object o){
        if (o instanceof Cat){
            System.out.println("Кошка");
        }
        else if (o instanceof Dog){
            System.out.println("Собака");
        }
        else if (o instanceof Bird){
            System.out.println("Птица");
        }
        else if (o instanceof Lamp){
            System.out.println("Лампа");
        }
    }
    public static class Cat{}
    public static class Dog{}
    public static class Bird{}
    public static class Lamp{}



}
