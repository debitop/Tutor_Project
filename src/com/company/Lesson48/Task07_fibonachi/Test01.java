package com.company.Lesson48.Task07_fibonachi;

public class Test01 {

    private static int f(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else if (index == 2) {
            return 1;
        } else {
            return f(index - 1) + f(index - 2);
        }
    }

    public static void main(String[] args) {
        int n = 11;
        for (int i = 1; i <= n; i++) {
            System.out.println(f(i) + " ");
        }
    }

}
