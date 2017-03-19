package com.company.Lesson21_OOP;

/**
 * Created by Саша on 17.01.2017.
 */
/* Ничего не поменяешь
1. Создать класс Cat с переменными name, age, weight.
2. Скрыть все внутренние переменные класса Cat:
- создать геттеры и сеттеры
- скрыть методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/
public class Test03 {
    public static void main(String[] args) {

    }
    private static class Cat{
        private String name;
        private int age;
        private int weight;

        public String getName(){return name;}

        private void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        private void setAge(int age) {
            this.age = age;
        }

        public int getWeight() {
            return weight;
        }

        private void setWeight(int weight) {
            this.weight = weight;
        }
    }
}