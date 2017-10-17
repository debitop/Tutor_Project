package com.company.Lesson51_Thread__obratniy_otschet;

/* Обратный отсчет
1. В выполняющем классе создать статический список строк
2. В статическом блоке добавить 5 строк в список, в виде: "Строка " + i, где i - число от 0 до 5
3. Создать класс Countdown, реализовать в нём интерфейс Runnable
4. В классе Countdown:
- создать приватную переменную int countFrom
- создать конструктор и инициализировать в нём переменную countFrom
- создать метод printCountdown()
- реализуй логику метода printCountdown так, чтобы каждые полсекунды выводился объект из
списка в обратном порядке - от переданного индекса до нуля.
- реализовать метод run(), он должен вызывать метод printCountdown(), пока countFrom больше нуля
5. В выполняющем методе создать нить и запустить её
Пример: Передан индекс 3
Пример вывода в консоль:
Строка 2
Строка 1
Строка 0
*/
public class Countdown extends Thread {
    private int countFrom;

    public Countdown(int countFrom) {
        this.countFrom = countFrom;
    }

    void printCountdown() throws InterruptedException {
        for (int i = countFrom; i >= 0; i--) {
            System.out.println(Test01.list.get(i));
            countFrom = i;
            sleep(500);
        }
    }

    @Override
    public void run() {
        while (countFrom > 0) {
            try {
                printCountdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
