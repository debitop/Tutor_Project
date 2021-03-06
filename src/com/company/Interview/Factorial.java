package com.company.Interview;

import java.math.BigInteger;
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(65));
        System.out.println(factorial(60));
    }

    static Map<Integer, BigInteger> cache = new HashMap<>();

    private static BigInteger factorial(int n){
        BigInteger result;

        if(n == 0) return BigInteger.ONE;

//        if((result = cache.get(n)) != null){
//            return result;
//        }
        if(cache.containsKey(n)){
            System.out.println("Cache");
            return cache.get(n);
        }
        result = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, result);//a
        return result;
    }
}
