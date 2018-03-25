package com.company.Interview.i20180325;

public class Fibonachi {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            System.out.println(fibonachi(i));
        }
    }

    static int fibonachi(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }

        return fibonachi(x - 2) + fibonachi(x - 1);

    }
}
