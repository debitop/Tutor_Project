package com.company.HomeWork;

import java.util.Date;

public class Test06_1_nod {
    public static void main(String[] args) {
        int num1=155;
        int num2=65;
        System.out.println(nod(num1,num2));
    }
    static int nod(int num1,int num2){
        if (num1>num2){
            int perem=num1;
            num1=num2;
            num2=perem;

        }

        for (int i=num1;i>0;i--){
            if (num1%i==0 && num2%i==0){
                return i;
            }
        }

        return 1;
    }
}
