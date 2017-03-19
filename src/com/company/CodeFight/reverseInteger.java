package com.company.CodeFight;

import static java.lang.Math.abs;

/**
 * Created by Саша on 12.03.2017.
 */
public class reverseInteger {
    public static void main(String[] args) {
        int num = -1050;
        int y = 0;
        reverseInteger(num);
    }

    private static void reverseInteger(int y) {

        int minus=1;
if (y<0){
    y=y*(-1);
    minus=-1;
}
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int num6;
        int num;
        num1 = y % 10;
        y = (y - num1) / 10;
        num2 = y % 10;
        y = (y - num2) / 10;
        num3 = y % 10;
        y = (y - num3) / 10;
        num4 = y % 10;
        y = (y - num4) / 10;
        num5 = y % 10;
        y = (y - num5) / 10;
        num6 = y % 10;

        num = minus*(num1 * 100000 + num2 * 10000 + num3 * 1000 + num4 * 100 + num5 * 10 + num6 * 1);

        while (num % 10 == 0) {
            num = num / 10;
        }

        System.out.println(num);

    }
}
//    int reverseInteger(int x) {
//        int minus = 1;
//        if (x < 0) {
//            x = x * (-1);
//            minus = -1;
//        }
//        int y=0;
//        for (int i = 0; i < 6; i++) {
//            y =y+ ((x % 10) * (int)(Math.pow(10, (6 - i))));
//            x = (x - (x % 10)) / 10;
//        }
//        while (y % 10 == 0) {
//            y = y / 10;
//        }
//        return y*minus;
//    }