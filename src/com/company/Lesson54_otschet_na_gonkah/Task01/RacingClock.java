package com.company.Lesson54_otschet_na_gonkah.Task01;

// TODO: 17.10.2017  //Сделать while без for и без if


/* Отсчет на гонках
1. В выполняющем классе создать статическую переменную int countSeconds, присвоить ей значение 3
2. Создать класс RacingClock, унаследовать его от Thread
3. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
4. Если нить работает 3.5 секунды или более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для countSeconds=4 : [4 3 2 1 Прервано!]
5. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 : [3 2 1 Марш!]
*/
public class RacingClock extends Thread {
    @Override
    public void run() {

        //      if (Test01.countSeconds>3){
        for (int i = (int) Test01.countSeconds; i > 0; i--) {
            System.out.print(i + " ");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.print(" Прервано!");
            }

        }
        if (Test01.countSeconds <= 3) {
            System.out.print(" Марш!");
        }
        //  System.out.println("Прервано!");
    }


}
//}
