package com.company.HomeWork;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Test04_1_factorial {
    public static void main(String[] args) {
        System.out.println( fact(10));
        System.out.println( fact(18));
        System.out.println( fact(16));
    }
    static Map<Integer,BigInteger>cashe = new HashMap<>();
    static BigInteger fact(int num){
        BigInteger result=BigInteger.ONE;
        if (num==0){
            return BigInteger.ONE;
        }
        if (cashe.containsKey(num)){
            System.out.println("cashe ^");
            return cashe.get(num);
        }
        result=fact(num-1).multiply(BigInteger.valueOf(num));
        cashe.put(num,result);

        return result;
    }
}
