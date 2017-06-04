package com.company.HomeWork;

/**
 * Created by Саша on 16.05.2017.
 */
public class Test01 implements I{
    public static void main(String[] args) {

    }
    Test01() {
        System.out.println("Base");
    }

    @Override
    public void method1() {

    }

    @Override
    public void m5() {

    }
}


abstract class Derived {
    public int a = 20;
    private static int b = 30;
    protected final int c = 40;
    protected static final int D = 50;


    protected abstract void method2();

    void method3(){

    }

}

interface I{
    public static final int a = 20;

    public abstract void method1();

    public static void m6(){
        System.out.println("OKOK");
    }

    public default void m5(){
        System.out.println("OK");
    }
}

