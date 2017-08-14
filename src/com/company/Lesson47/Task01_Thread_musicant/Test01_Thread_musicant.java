package com.company.Lesson47.Task01_Thread_musicant;

/*
1. Создать интерфейс MusicalInstrument с методами: Date startPlaying() и Date stopPlaying()
2. Сделать интерфейс MusicalInstrument таском для нити.
3. В выполняющем классе создать переменную типа int с названием delay и значением 1000
4. В выполняющем классе создать мтеод sleepNSeconds(int n), который должен погружат в сон нить на n * delay миллисекунд
5. Создать класс Violin так, чтоб он стал таском для нити. Используйте интерфейс MusicalInstrument
5.1 Создать приватную переменную private String musician;
5.2 Создать конструктор.
6. Реализуй необходимые методы в нити Violin. Реализация должна быть следующей:
6.1. Метод startPlaying() должен возвращать время начала игры.
6.2. Метод stopPlaying() должен возвращать время окончания игры.
7. Создать метод run() и выполнить в нём следующее:
7.1. Считай время начала игры - метод startPlaying().
7.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
7.3. Считай время окончания игры - метод stopPlaying().
7.4. Выведи на консоль продолжительность игры в миллисекундах. Пример "Playing 1002 ms".
8. В выполняющем классе создать метод main и зпустить таск класса Violin.
*/
public class Test01_Thread_musicant {
    static int delay = 1000;

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Violin("Boris"));
        Thread thread1 = new Thread(new Violin("Boris1"));
        Thread thread2 = new Thread(new Violin("Boris2"));
        thread.start();
        System.out.println(thread.getName());
        thread.join();
        thread1.start();
        System.out.println(thread1.getName());
        thread1.join();
        thread2.start();
        System.out.println(thread2.getName());
        thread2.join();
    }

    static void sleepNSeconds(int n) {
        try {
            Thread.sleep(n * delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
