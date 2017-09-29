package com.company.HomeWork;

public class Test03 {


    static byte m1() { // 127
        final char c1 = 127;
        return c1;                                  // 1
    }

 //   static byte m2(final char c2) {
 //      return c2;
//    }  // 2

    public static void main(String[] args) {
        char c3 = '\u0003';
//        System.out.print("" + m1() + m2((char) 120));         // 3
    }

}
