package com.company.Lesson04;

/**
 * Created by Саша on 01.11.2016.
 */ // Man -> name, age, wife; Woman -> name, age, husband;
    // main -> 1 - Man/Woman -> sout

public class TestClass03 {
    public static void main(String[] args) {
        Man man = new Man("Виктор", 25, null);
        Woman woman = new Woman("Ольга", 30, man);
        man.wife = woman;
        System.out.println(man.name + " " + man.age + " " + man.wife.name);
        System.out.println(woman.name + " " + woman.age + " " + woman.husband.name);
    }

    public static class Man{
        String name;
        int age;
        Woman wife;

        Man (String name1, int age1, Woman wife1){
            this.name = name1;
            this.age = age1;
            this.wife = wife1;
        }
    }

    public static class Woman{
        String name;
        int age;
        Man husband;
        Woman (String name1, int age1, Man husband1){
            this.name = name1;
            this.age = age1;
            this.husband = husband1;
        }
    }
}
