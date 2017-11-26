package com.company.Lesson60_Executor_Map_Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add("" + i);
        }

        list = reduce(list);

        for (String s : list) {
            System.out.println(s);
        }

    }

    public static String map(String s){
        return s + "."; // any logic
    }

    public static List<String> reduce(List<String> list){
        List<String> result = new ArrayList<>();

        ExecutorService executorService = Executors.newFixedThreadPool(100);

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " Start");
                    result.add(map(s));
                    System.out.println(Thread.currentThread().getName() + " End");
                }
            };

            executorService.execute(runnable);
        }

        executorService.shutdown();
        while (!executorService.isTerminated()){}
        System.out.println("Finished all threads");
        return result;
    }
}
