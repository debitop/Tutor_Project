package com.company.Lesson32_Game_Robot_Fight.Task01;

/**
 * Created by Саша on 09.04.2017.
 */
/* Битва роботов
1. Создать класс Robot, BodyPart интерфейсы Attackable,Defensable и абстрактный класс AbstractRobot
2. В классе BodyPart создать переменную String bodyPart; добавить 4 объекта - части тела ( рука, нога, голова, грудь).
 Сделать объекты неизменяемыми.
3. В интерфейсе Attackable создать метод BodyPart attack();
4. В интерфейсе Defensable создать метод BodyPart defense();
5. В классе AbstractRobot создать переменные private String name; private static int hitCount;
6 В классе AbstractRobot создать логику атаки и защиты. Реализовать интерфейсы Attackable и Defensable
6.1 В методах attack() и defense() инициализировать переменную hitCount рандомным числом от 1 до 4.
    В зависимости от результата инициализации должна быть атакована и защищена определенная часть тела робота.
7. Унаследовать класс Robot от AbstractRobot. В классе Robot создать конструктор супер класса.
8. В выполняющем классе создать метод doMove(AbstractRobot robotFirst, AbstractRobot robotSecond).
8.1 В методе doMove реализовать логику вывода на экран надписи "%s атаковал робота %s, атакована %s, защищена %s"
*/
public class Test01 {
    public static void main(String[] args) {
        Robot rob1 = new Robot("Вася");
        Robot rob2 = new Robot("Петя");

        doMove(rob1, rob2);
        doMove(rob1, rob2);
        doMove(rob1, rob2);
        doMove(rob1, rob2);

        doMove(rob2, rob1);
        doMove(rob2, rob1);
        doMove(rob2, rob1);
        doMove(rob2, rob1);
    }

    static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
        BodyPart attacked = robotFirst.attack();
        BodyPart defensed = robotFirst.defense();
        System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s", robotFirst.getName(), robotSecond.getName(), attacked, defensed));
        if (attacked == defensed) {
            System.out.println("урон не нанесен");
        } else System.out.println("урон нанесен");
    }
}
