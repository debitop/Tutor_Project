package com.company.Lesson46.Task01;

/* Вывод стек-трейса
1. Создать таск - класс public static SpecialThread - на основании интерфейса Runnable
2. SpecialThread должен выводить в консоль свой стек-трейс.
*/
public class Test05_metod_join {
    public static void main(String[] args) {
        SpecialThread thread = new SpecialThread();
        Thread t = new Thread(thread);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            System.out.println(element);
        }
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                System.out.println(element);
            }
            System.out.println("--------------");
        }
    }
}
