package com.company.Lesson39_Singleton.Task01;

/**
 * Created by Саша on 21.05.2017.
 */
/* Singleton
Класс является синглтоном (реализует паттерн(шаблон) Singleton), если позволяет создать всего один объект своего типа.

Реализовать Singleton pattern:
1. Создай класс Singleton в отдельном файле.
2. Добавь в него статический метод getInstance().
3. Метод getInstance должен возвращать один и тот же объект класса Singleton при любом вызове метода getInstance.
4. Подумай, каким образом можно запретить создание других объектов этого класса.
5. Сделай все конструкторы в классе Singleton приватными (private).

6. В итоге должна быть возможность создать объект (экземпляр класса) ТОЛЬКО используя метод getInstance.
*/
public class Test01 {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }
}
