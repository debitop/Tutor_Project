package com.company.Lesson53_schitaem_seconds;

/* Считаем секунды
1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/
public class Stopwatch extends Thread {
    int count = 0;

    @Override
    public void run() {


        try {
            while (true) {
                sleep(1000);
                count++;
            }
        } catch (InterruptedException e) {
            System.out.println(count);
        }

    }
}
