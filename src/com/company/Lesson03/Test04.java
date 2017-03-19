package com.company.Lesson03;

/**
 * Created by Саша on 30.10.2016.
 */
public class Test04 {
    public static void main(String[] args){
        System.out.println(kvadrat(23));
        System.out.println(procent(33));
        stroki("ghbdtn");
        System.out.println(kurs(103));
    }
    public static int kvadrat(int a){
        return a*a;
    }
    public static double procent(int a){
        return 1.1*a;
    }
    public static void stroki(String a){
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

    }
    public static double kurs (int dol){
        return dol*65.5;
    }
}
