package com.company.Lesson48.Task08_fibonachi_02;

public class Test01 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i <=n; i++) {
            System.out.println(f(i) + " ");
        }
    }

    static int f(int index) {
        if (index <= 0) {
            return 0;
        }
        if (index==1){
            return 1;
        }
        else {
            return f(index-2)+f(index-1);
        }


    }
}
