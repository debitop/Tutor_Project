package com.company.HomeWork;

public class Test05_1_fibonachi {
    public static void main(String[] args) {
        int num=10;
        for (int i=0;i<num;i++){
            System.out.println( fib(i));
        }

    }

    static int fib(int num){
    int result=0;
        if (num<=0){
        return 0;
    }
    if (num==1){
        return 1;
    }
    return (fib(num-2)+fib(num-1));

    }
}
