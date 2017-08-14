package com.company.Lesson47.Task03_Horse_Racing;

import java.util.ArrayList;
import java.util.List;

/* Horse Racing
1. Создать класс Horse, унаследовать его от Thread
1.1 В классе Horse создать приватную переменную isFinished, подумать какой тип у этой переменной
1.2 Создать геттер для переменной isFinished
1.3 Создать конструктор с параметром String name, передавать этот параметр в конструктор суперкласса
1.4 Переопределить метод run(), добавить в него следующий код:
- запустить цикл на 1000 иттераций, когда будет достигнута последняя иттерация выводить на экран строку:
getName() + " has finished the race!"
- присвоить параметру isFinished значение true, у объекта, который запустил нить;
2. В выполняющем класе создать переменную int countHorses = 10;
3. В выполняющем классе создать метод List<Horse> prepareHorsesAndStart(), который должен:
- создавать список из лошадей, с размером, который указан в переменной countHorses
- добавлять в список объекты лошадей, в качестве имени отправлять "Horse_" + number, где number строка от 01 до countHorses + 1
- после того, как список заполнен, запускать нить для каждого объекта в списке
- возвращать список лошадей
4. Создать метод calculateHorsesFinished. Он должен:
- посчитать количество финишировавших лошадей и возвратить его. Используй метод isFinished().
- если лошадь еще не пришла к финишу (!isFinished()), то:
4.1. Вывести в консоль "Waiting for " + horse.getName().
4.2. Подождать, пока она завершит гонку. Подумай, какой метод нужно использовать для этого.

*/
public class Test01{
    static int c = 20; // class loader
    int d = 30; // creating instance
    public static void main(String[] args) {

        System.out.println(Test01.c);
        //calculateHorsesFinished(prepareHorsesAndStart());
        int b = 10;
        A a = new A();
        a.a = 5;
        m1();
        m2(a);
        System.out.println(A.a);
        System.out.println(b); // 10
        System.out.println(a.a); // 10

        //  System.out.println(calculateHorsesFinished(prepareHorsesAndStart()));
    }

    static void m1(){

    }

    static void m2(A a){
        a.a = 10;
    }

    static class A{
        static int a = 23;
    }

    static volatile int countHorses = 10;

    static synchronized List<Horse> prepareHorsesAndStart() {
        List<Horse> list = new ArrayList<>();
        for (int i = 0; i < countHorses; i++) {
            if (i < 10) {
                list.add(new Horse("Horse 0" + (i + 1)));
            } else {
                list.add(new Horse("Horse " + (i + 1)));
            }
        }
        for (Horse horse : list) {
            horse.start();
        }

        return list;
    }

    static synchronized int calculateHorsesFinished(List<Horse> list) {
        int count = 0;
        while (count != countHorses) {
            for (Horse horse : list) {
                if (horse.isFinished()) {
                    count++;
                } else {
                    System.out.println("Waiting for " + horse.getName());
                    try {
                        horse.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }


        return count;
    }
}

class B extends Test01{
    static void m1(){

    }
}