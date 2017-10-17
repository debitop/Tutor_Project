package com.company.Lesson55_Thread_a_bez_interrupt_slabo.Task01;

/* А без interrupt слабо?
1. Создать класс TestThread, который реализует интерфейс Runnable
2. Нить должна выводить надпись Tik, каждые пол секунды
3. Создать метод ourInterruptMethod()
4. Сделать так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
5. В выполняющем классе запустить нить, она должна отработать 3 секунды, а потом прерваться
*/
public class TestThread implements Runnable {
    boolean a = true;
    int count = 0;

    @Override
    public void run() {

        while (a) {
            System.out.println("Tik");
            try {
                Thread.sleep(500);
                count++;
                if (count == 6) {
                    ourInterruptMethod();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    void ourInterruptMethod() {
        a = false;
    }
}
