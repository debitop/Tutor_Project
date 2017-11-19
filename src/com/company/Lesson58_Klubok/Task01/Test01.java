package com.company.Lesson58_Klubok.Task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
0. В выполняющем классе создать метод void sleep(), он должен отправлять нить в сон на 100 мс;
1. Создай интерфейс Message с одним методом void showWarning();
2. Создай 5 различных своих нитей c отличным от Thread типом:
2.1. нить 1 должна бесконечно выполняться;
2.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
2.3. нить 3 должна каждые полсекунды выводить "Ура";
2.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
2.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
3. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
4. Нити не должны стартовать автоматически.
5. В методе main запустить 2,4 и 5 нити. ( Проверить работает ли 4 нить можно при помощи метода isAlive() )
*/
public class Test01 {
    static List<Thread> threads = new ArrayList<Thread>();

    static {
        threads.add(new Thread01());
        threads.add(new Thread02());
        threads.add(new Thread03());
        threads.add(new Thread04());
        threads.add(new Thread05());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t2 = threads.get(1);
        t2.start();
        t2.interrupt();
        Thread04 t4 = (Thread04) threads.get(3);
        t4.start();
        t4.showWarning();
        Thread t5 = threads.get(4);
        t5.start();
    }

    static void sleep() throws InterruptedException {
        Thread.sleep(100);

    }


}

class Thread01 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("нить 1");
        }
    }
}

class Thread02 extends Thread {
    @Override

    public void run() {
        try {
            while (!isInterrupted()) {

            }
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

class Thread03 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Ура");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class Thread04 extends Thread implements Message {
    @Override
    public void run() {
        while (!isInterrupted()) {

        }

    }

    @Override
    public void showWarning() {
        System.out.println("прерываем Т4");
        this.interrupt();

    }
}

class Thread05 extends Thread {
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = 0;
        while (true) {
            try {
                String s = reader.readLine();
                if (s.equals("N")) {
                    System.out.println(num);
                    reader.close();
                    break;

                } else {
                    num += Integer.parseInt(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
