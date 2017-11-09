package com.company.HomeWork;

public class Test06_nod {
    public static void main(String[] args) {
        int a = 240;
        int b = 80;
        System.out.println(nod(a, b));
    }

    static int nod(int num1, int num2) {
        if (num2 > num1) {
            int perem = num1;
            num1 = num2;
            num2 = perem;
        }
        for (int i = 0; i < num1; i++) {
            if ((num1 % (num2 - i) == 0) && (num2 % (num2 - i) == 0)) {
                return num2 - i;
            }
        }
        return 1;
    }
}
