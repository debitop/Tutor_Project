package com.company.Lesson55_Thread_a_bez_interrupt_slabo.Task01;
/* А без interrupt слабо?
1. Создать класс TestThread, который реализует интерфейс Runnable
2. Нить должна выводить надпись Tik, каждые пол секунды
3. Создать метод ourInterruptMethod()
4. Сделать так, чтобы в методе ourInterruptMethod можно было сделать так, чтобы нить TestThread завершилась сама.
Нельзя использовать метод interrupt.
5. В выполняющем классе запустить нить, она должна отработать 3 секунды, а потом прерваться
*/
public class Test01 {
    public static void main(String[] args) throws InterruptedException {
        TestThread test =new TestThread();
        new Thread(test).start();
        Thread.sleep(3000);
        ourInterruptMethod(test);
    }

    static synchronized void ourInterruptMethod(TestThread thraad) {
        thraad.a = false;
    }
}
