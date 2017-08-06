package com.company.Lesson47.Task03_Horse_Racing;

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
public class Horse extends Thread {
    Horse(String name) {
        super(name);
    }

    private boolean isFinished;

    public boolean isFinished() {
        return isFinished;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (i == 999) {
                System.out.println(getName() + " has finished the race!");
                isFinished = true;
            }
        }

    }
}
