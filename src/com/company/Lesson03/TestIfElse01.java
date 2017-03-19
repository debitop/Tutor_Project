package com.company.Lesson03;

/**
 * Created by Саша on 30.10.2016.
 */
public class TestIfElse01 {
    public static void main(String[] args) {
        int a = 8;
        int b = 8;
        // ==
        // && - AND true true
        // || - OR  true false

        if(a > b){
            System.out.println("a > b");
        } else if(a == b) {
            System.out.println("b = a");
        } else {
            System.out.println("a < b");
        }
    }
}
