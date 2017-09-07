package com.company.Lesson46_Thread.Task01;

/* My second thread
1. Создать public static класс TestThread унаследовавшись от класса Thread.
2. Создать статик блок внутри TestThread, который выводит в консоль "it's static block inside TestThread".
3. Метод run должен выводить в консоль "it's run method".
*/
public class Test04 {
    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
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
