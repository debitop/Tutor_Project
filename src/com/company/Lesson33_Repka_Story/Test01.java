package com.company.Lesson33_Repka_Story;

/**
 * Created by Саша on 14.04.2017.
 * Hello s1
 * Hello s2
 * Hello s3 s4
 */
public class Test01 {
    public static void main(String[] args) {
        String s1 = new String("Hello");
        String s2 = new String("Hello");

        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String s3 = "Hello";
        String s4 = "Hello";

        if (s3 == s4) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

abstract class A {
    int a = 8;

    public A() {
        show();
    }

    abstract void show();
}

class B extends A {
    int a = 90;

    public B() {
        super();
    }

    void show() {
        System.out.println("" + a);
    }

    public static void main(String args[]) {
        new B();
    }
}
