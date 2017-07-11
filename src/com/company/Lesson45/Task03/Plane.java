package com.company.Lesson45.Task03;

/**
 * Created by Саша on 09.07.2017.
 */
/* Осваивание статического блока
0. Создать интерфейс Flyable с методом String fly();
1. В отдельных файлах создать классы Plane и Helicopter, реализующие интерфейс Flyable.
2. Класс Plane должен иметь 1 конструктор с приватным параметром int - количество перевозимых пассажиров.
2.1 В классе Plane метод fly() должен возвращать строку "Plane is flying";
2.2 В классе Plane переопределить метод toString(), что бы он возвращал строку: fly() + " with " + getPasenger();
3.1 Класс Helicopter должен иметь 1 конструктор с приватным параметром int - количество перевозимых пассажиров.
3.2 В классе Helicopter метод fly() должен возвращать строку "Helicopter is flying";
3.3 В классе Helicopter переопределить метод toString(), что бы он возвращал строку: fly() + " with " + getPasenger();
4. В классе Solution создать статическую переменную Flyable result;
5. В статическом методе reset класса Solution:
5.1. В бесконечном цикле считывать с консоли параметр типа String. Параметр может быть "plane" или "helicopter".
5.2. Если параметр равен "helicopter", то считать второй параметр типа int, статическому объекту Flyable result присвоить объект класса Helicopter.
5.3. Если параметр равен "plane", то считать второй параметр типа int, статическому объекту Flyable result присвоить объект класса Plane.
5.3. Иначе завершить ввод.
6. В статическом блоке инициализировать Flyable result вызвав метод reset, отловить все checked исключения.
7. В выполняющем методе сделать вывод на экран строку: The program worked! .
*/
public class Plane implements Flyable {
    private int pasenger;

    Plane(int pasenger) {
        this.pasenger = pasenger;
    }

    public int getPasenger() {
        return pasenger;
    }

    @Override
    public String fly() {
        return "Plane is flying";
    }

    @Override
    public String toString() {
        return fly() + " with " + getPasenger();
    }
}
