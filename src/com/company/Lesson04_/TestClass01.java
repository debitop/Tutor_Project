package com.company.Lesson04_;

/**
 * Created by Саша on 01.11.2016.
 */
public class TestClass01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(3, "Barsik");
        Cat cat2 = new Cat("Bars", 5);
        System.out.println(cat1.name + " " + cat1.age);
        System.out.println(cat2);
    }

    public static class Cat {
        String name;
        int age;
        int weight;

        public Cat(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public Cat(int age, String name) {
            this.name = name;
            this.age = age;
        }


        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    '}';
        }
    }

}
