package com.company.Lesson49_Thread.Task01;

/* Big Ben clock
1. В выполняющем классе создать приватную переменную isStopped, присвоить ей значение false
2. Создать класс Clock, унаследовать его от Thread
3. В классе Clock:
- создать параметры cityName, hours, minutes, seconds - пдумать, какой тип у каждого параметра
- создать конструктор и инициализировать все параметры класса, так же запустить нить в конструкторе
- создать и реализовать логику метода printTime так, чтобы каждую секунду выдавалось время начиная с установленного в конструкторе
Пример:
В г. Лондон сейчас 23:59:58!
В г. Лондон сейчас 23:59:59!
В г. Лондон сейчас полночь!
В г. Лондон сейчас 0:0:1!
- создать метод run:
 -- пока переменная isStopped равняется false выполнять метод printTime;
 -- отлавливать все checked исключения.
4. В выполняющем методе:
- создать объект класса Clock
- отправить главную нить в сон на 4 секунды
- поменять значение переменной isStopped на true
- отправить главную нить в сон на 1 секунду
*/
public class Clock extends Thread {
    String cityName;
    int hours;
    int minutes;
    int seconds;

    Clock(String cityName, int hours, int minutes, int seconds) {
        this.cityName = cityName;
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        start();
    }

    void printTime() throws InterruptedException {
        if (hours == 0 && minutes == 0 && seconds == 0) {
            System.out.println("В г. " + cityName + " полночь!");
        } else
            System.out.println("В г. " + cityName + " сейчас " + hours + ":" + minutes + ":" + seconds + "!");
        sleep(1000);
        seconds++;
        if (seconds == 60) {
            minutes++;
            seconds = 0;
        }
        if (minutes == 60) {
            hours++;
            minutes = 0;
        }
        if (hours == 24) {
            System.out.println("В г. " + cityName + " полночь!");
            sleep(1000);
            hours = 0;
            seconds++;
        }

        //       seconds == 60 ? (minutes++; seconds = 0;):seconds++;
//        if (seconds != 59) {
//            seconds++;
//        } else {
//            seconds = 0;
//            if (minutes != 59) {
//                minutes++;
//            } else {
//                minutes = 0;
//                if (hours != 23) {
//                    hours++;
//                } else
//
//                    System.out.println("В г. " + cityName + " полночь!");
//
//                hours = 0;
//                sleep(1000);
//                seconds++;
//            }
//        }
    }

    @Override
    public void run() {
        try {
            while (Test01.isStopped == false) {
                printTime();
            }
        } catch (InterruptedException e) {

        }

    }
}
