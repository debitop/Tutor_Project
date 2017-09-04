package com.company.Lesson48.Task04_Factorial;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(100));
    }

    static BigInteger fact;
    static Map<Integer, BigInteger> cache = new HashMap<>();

    static BigInteger factorial(int num) {
        if (num == 0) {
            fact = BigInteger.ONE;
            return fact;
        }
        if (cache.containsKey(num)) {
            fact = cache.get(num);
            return fact;
        }
        fact = factorial(num - 1).multiply(BigInteger.valueOf(num));
        cache.put(num,fact);
        return fact;
    }
}
