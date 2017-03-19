package com.company.Lesson03;

/**
 * Created by Саша on 30.10.2016.
 */
public class TestIfElse02 {
    public static void main(String[] args) {
        int a = 100;
        int b = 44;

        if(50 <= a && a <= 100){
            System.out.println("Popalo");
        } else {
            System.out.println("Ne popalo");
        }

        if(50 >= b || b >= 100){
            System.out.println("Popalo");
        } else {
            System.out.println("Ne popalo");
        }
    }
}
