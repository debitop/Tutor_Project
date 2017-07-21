package com.company.HomeWork.Test02;

/**
 * Created by Саша on 18.07.2017.
 */
public class Test03 {
    public static void main(String[] args) {

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
 //   int a = 90;

    void  show() {
        System.out.println("" + a);
    }

    public static void main(String args[]) {
        new B();
    }
}
