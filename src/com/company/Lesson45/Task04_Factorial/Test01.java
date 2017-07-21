package com.company.Lesson45.Task04_Factorial;

/**
 * Created by Саша on 11.07.2017.
 */
public class Test01 {
    public static void main(String[] args) {
        fact(30);
    }
    static void fact(int num){
        int sum=1;
        for (int i=1; i<=num; i++ ){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
