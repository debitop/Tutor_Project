package com.company.Lesson48.Task02_Factorial;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorial(15));
        System.out.println(factorial(150));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    static BigInteger factorial(int num) {
        BigInteger fact;
        if (num <= 0) {
            fact = BigInteger.ONE;
            return fact;
        }
        if (cache.containsKey(num)) {
            fact = cache.get(num);
            return fact;
        }
        fact = factorial(num - 1).multiply(BigInteger.valueOf(num));
        cache.put(num, fact);
        return fact;
    }
}
