package com.company.Lesson48.Task05_Factorial;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test01 {
    public static void main(String[] args) {
        System.out.println(fact(30));
        System.out.println(fact(10));
    }

    static BigInteger fact;
    static Map<Integer, BigInteger> cache = new HashMap<Integer, BigInteger>();

    static BigInteger fact(int n) {
        if (n == 0) {
            fact = BigInteger.ONE;
            return fact;
        }
        if (cache.containsKey(n)) {
            fact = cache.get(n);
            System.out.println("cache :");
            return fact;
        }
        fact = fact(n - 1).multiply(BigInteger.valueOf(n));
        cache.put(n, fact);

        return fact;
    }

}
