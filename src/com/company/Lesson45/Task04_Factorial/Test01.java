package com.company.Lesson45.Task04_Factorial;

/**
 * Created by Саша on 11.07.2017.
 */
public class Test01 {
    static int count;
    public static void main(String[] args) {
       // fact(30);
        System.out.println(fact1(3));
    }
    static void fact(int num){
        int sum=1;
        for (int i=1; i<=num; i++ ){
            sum=sum*i;
        }
        System.out.println(sum);
    }

    static int fact1(int num){ // 10
        int res;
        System.out.println(++count);
//        if(num == 0) return 1;
        res = num * fact1(num - 1);
        return res;
    }
}
