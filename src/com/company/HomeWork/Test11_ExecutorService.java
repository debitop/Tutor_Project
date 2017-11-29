package com.company.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test11_ExecutorService {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list = reduce(list);
        for (int i = 0; i < 100; i++) {
            System.out.println(list.get(i));
        }

    }

    static int map(int num) {
        return num + 2;
    }

    static List<Integer> reduce(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        for (int i = 0; i < 100; i++) {
            int a = list.get(i);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    result.add(map(a));
                }
            };
            executorService.execute(runnable);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {

        }
        return result;
    }
}
