package com.company.HomeWork;

public class Test05_fibonachi {
    public static void main(String[] args) {
        int a=10;
        for (int i=0; i<=a; i++){
        System.out.println(fibon(i));
    }}

  static   int fibon(int num) {
        if (num == 1) {
            return 1;
        }
        if (num == 2) {
            return 1;
        }
        if (num <= 0) {
            return 0;
        }
        int fib = fibon(num - 2) + fibon(num - 1);

        return fib;
    }
}
