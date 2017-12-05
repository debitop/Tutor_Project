package com.company.HomeWork;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test04_factorial {
    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println(fact(6));


        //System.out.println(fact());

    }
   static Map <Integer,BigInteger> cache = new HashMap<>();
    static BigInteger fact(int num){
        BigInteger fact=BigInteger.ONE;
        if (num==0){
             return fact;
        }
        if (cache.containsKey(num)) {
            System.out.print("cache: ");
           return cache.get(num);

        } else
        fact = BigInteger.valueOf(num).multiply(fact(num-1));
        cache.put(num,fact);
        return fact;
    }
}
