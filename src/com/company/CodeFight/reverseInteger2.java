package com.company.CodeFight;

/**
 * Created by Саша on 12.03.2017.
 */
public class reverseInteger2 {
    public static void main(String[] args) {
        int num = 0;
        reverseInteger(num);
    }

    private static void reverseInteger(int y) {

        int minus = 1;
        if (y < 0) {
            y = y * (-1);
            minus = -1;
        }
        int xxx=0;
        for (int i = 0; i < 6; i++) {
            xxx =xxx+ ((y % 10) * (int)(Math.pow(10, (6 - i))));
            y = (y - (y % 10)) / 10;
        }


        while (xxx % 10 == 0 && xxx!=0) {
            xxx = xxx / 10;
        }
        System.out.println(xxx * minus);
    }
}
