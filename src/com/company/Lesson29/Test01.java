package com.company.Lesson29;

/**
 * Created by Саша on 26.03.2017.
 */


public class Test01 {
    public static void main(String[] args) {
        Pet pet = new Cat();

        if(pet instanceof Pet){
            System.out.println("pet");
        }
        if(pet instanceof Dog){
            System.out.println("dog");
        }
        if(pet instanceof Cat){
            System.out.println("cat");
        }
    }

    public static class Pet{}
    public static class Dog extends Pet{}
    public static class Cat extends Pet{}

}
