package com.company.Lesson04_;

/**
 * Created by Саша on 01.11.2016.
 */ // Cat -> name, age, tail; main -> 2 object -> 1 - sout, 2 - toString
public class TestClass02_konstruktor {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик", 5, 10);
        Cat cat2 = new Cat("Барс", 3, 7);
        System.out.println(cat1.name + " " + cat1.age + " " + cat1.tail);
        System.out.println(cat2);

    }
    public static class Cat {
        String name;
        int age;
        int tail;
        Cat (String name1, int age1, int tail1){
            this.age = age1;
            this.name = name1;
            this.tail = tail1;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", tail=" + tail +
                    '}';
        }
    }
}
