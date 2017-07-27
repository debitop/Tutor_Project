package com.company.Lesson46.Task01;

public class Test02 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
        TestThread thread1 = new TestThread();
        thread1.start();
        TestThread thread2 = new TestThread();
        thread2.start();
    }

    public static class TestThread extends Thread {
        static {
            System.out.println("it's static block inside TestThread");
        }

        public void run() {
            System.out.println("it's run method");
        }
    }
}
