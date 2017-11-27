package com.company.Lesson60_Executor_Map_Reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }


    }

    static int map(int num) {
        num *= 2;
        return num;
    }
    List<Integer> reduce(List<Integer>list){
        List<Integer>result = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(100);
        for (int i=0; i<list.size(); i++){
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    //result.add(map())
                }
            };
        }

        return list;
    }

}
