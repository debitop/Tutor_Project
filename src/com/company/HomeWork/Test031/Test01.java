package com.company.HomeWork.Test031;

public class Test01 {
    public static void main(String[] args) {
        Inter i=new Inter() {   //начало анонимного класса
            @Override
            public int m() {
                return 0;
            }
        };
        System.out.println(i.m());
    }
}

interface Inter {
    int m();
}
