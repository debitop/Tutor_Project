package com.company.HomeWork;

/**
 * Created by Саша on 16.05.2017.
 */
public class Test01 {
    Test01() {
        System.out.println("Base");
    }
}
class Derived extends Test01 {
    public static void main(String[] argv) {


        Derived d = new Derived();
    }
    void Derived() {
        System.out.println("Derived");
    }
    Derived (){super();};
}