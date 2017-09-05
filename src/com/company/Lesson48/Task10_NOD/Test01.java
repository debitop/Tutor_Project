package com.company.Lesson48.Task10_NOD;

public class Test01 {
    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        System.out.println(nod(a, b));

    }

    static int nod(int a, int b) {
        if (a < b) {
            for (int i = a; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }
        } else {
            for (int i = b; i > 0; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }

        }


       return 1;
    }

}
