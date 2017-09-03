package com.company.Lesson48.Task01_Factorial;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

//factorial
public class Test01 {
    public static void main(String[] args) {
        System.out.println(factorial(15));
        System.out.println(factorial(10));


    }
    static Map<Integer, BigInteger> cache = new HashMap<>();


    static BigInteger factorial(int n) {
        BigInteger fact;
        if (n <= 0) {
            fact = BigInteger.ONE;
            return fact;
        }
        if (cache.containsKey(n)){
            System.out.print("cache ");
            return cache.get(n);
        }

        fact = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n,fact);
        return fact;
    }
}
