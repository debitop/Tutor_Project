package com.company.Lesson46.Task01;

/* My first thread
Создать public static class TestThread - нить с помощью интерфейса Runnable.
TestThread должен выводить в консоль "My first thread".
*/

public class Test03 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        new Thread(thread).start();
        new Thread(thread).start();
        new Thread(thread).start();
    }
    public  static class TestThread implements Runnable{
        public void run() {
            System.out.println("My first thread");
        }
    }
}
