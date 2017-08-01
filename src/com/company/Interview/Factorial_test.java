package com.company.Interview;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Factorial_test {
    public static void main(String[] args) {
        System.out.println(facrorial(12));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    private static BigInteger facrorial(int x) {
        BigInteger result;
        if (x == 0) return BigInteger.ONE;


        if (cache.containsKey(x)) {
            System.out.println("cache");
            return cache.get(x);
        }
        result = BigInteger.valueOf(x).multiply(facrorial(x - 1));
        cache.put(x,result);
        return result;
    }
}
