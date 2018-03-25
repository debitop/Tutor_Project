package com.company.Interview.i20180325;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial {

    static Map<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(factorial(30));
        System.out.println(factorial(10));
        System.out.println(factorial(30));

    }

    static BigInteger factorial(int x) {
        BigInteger y;
        if (cache.containsKey(x)) {
            System.out.println("cache: ");
            return cache.get(x);

        }
        if (x == 0) {
            return BigInteger.ONE;
        }
        y = BigInteger.valueOf(x).multiply(factorial(x - 1));
        cache.put(x, y);

        return y;
    }
}
