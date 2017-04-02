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
public class User implements DBObject{
    long id;
    String name;

    @Override
    public User initializeIdAndName(long id, String name) {
        this.id=id;
        this.name=name;
        return this;
    }

//    public User(long id, String name) {
//        this.id = id;
//        this.name = name;
//    }

    @Override
    public String toString() {
        return String.format("User has name %s, id = %d", name, id);
    }
}
