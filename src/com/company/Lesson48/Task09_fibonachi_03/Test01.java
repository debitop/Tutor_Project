package com.company.Lesson48.Task09_fibonachi_03;

public class Test01 {
    public static void main(String[] args) {
    int n=10;
    for (int i=0; i<n;i++)
        System.out.println(f(i)+ " ");
    }
    static int f(int i){
        if (i==0){
            return 0;
        }
        if (i==1){
            return 1;
        }
        else return f(i-2)+f(i-1);
    }
}
