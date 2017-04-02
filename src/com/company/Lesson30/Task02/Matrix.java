package com.company.Lesson30.Task02;

/**
 * Created by Саша on 02.04.2017.
 */
/*
1. Создать интерфейс DBObject и создать в нем метод initializeIdAndName(long id, String name)
2. Создать класс User с параметрами long id, String name; Вынести реализацию метода initializeIdAndName в класс User.
3. initializeIdAndName в классе User должен возвращать тип User.
4. Переопределить метод toString() в классе User, что бы он выводил следующее User has name %s, id = %d
5. Создать класс Matrix и создать в нем 2 объекта используя ранее созданые интерефейс и класс.
6. В методе main вывести на экран объекты.
*/
public class Matrix {
   static DBObject name1 = new User().initializeIdAndName(100, "Вася");
   static DBObject name2 = new User().initializeIdAndName(101, "Петя");

}
