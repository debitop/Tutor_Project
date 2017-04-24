package com.company.Lesson35_Bridge_Persons_OOP.Task02_Persons___factory_metod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 23.04.2017.
 */
/* User, Looser, Coder and Proger
1. Ввести [в цикле] с клавиатуры несколько строк (ключей).
Строки(ключи) могут быть такими: "user", "looser", "coder", "proger".
Ввод окончен, когда строка не совпадает ни с одной из выше указанных.
1.1. Создать интерфейс Person, в н'м создать 4 вложенных класса:
- User, с методом live() - который выводит на экран строку типа Usually I just live.
- Looser, с методом doNothing() - который выводит на экран строку типа Usually I do nothing.
- Coder, с методом coding() - который выводит на экран строку типа Usually I create code.
- Proger, с методом enjoy() - который выводит на экран строку типа Wonderful life!.
2. Для каждой введенной строки нужно:
2.1. Создать соответствующий объект [см Person.java], например, для строки "user" нужно создать объект класса User.
2.2. Передать этот объект в метод doWork.
3. Написать реализацию метода doWork, который:
3.1. Вызывает метод live() у переданного обекта, если этот объект (person) имеет тип User.
3.2. Вызывает метод doNothing(), если person имеет тип Looser.
3.3. Вызывает метод coding(), если person имеет тип Coder.
3.4. Вызывает метод enjoy(), если person имеет тип Proger.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         while (true){
             String s = reader.readLine();
             Person person = null;
             if (s.equals("user")){
                 person = new Person.User();
             }
             else if (s.equals("looser")){
                 person = new Person.Looser();
             }
             else if (s.equals("coder")){
                 person = new Person.Coder();
             }
             else if (s.equals("proger")){
                 person = new Person.Proger();
             }
             else break;
             doWork(person);
         }
    }
    static void doWork(Person person){
        if (person instanceof Person.User){
            ((Person.User) person).live();  //приводимся к типу User
        }
        else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
        else if (person instanceof Person.Coder){
            ((Person.Coder) person).coding();
        }
        else if (person instanceof Person.Looser){
            ((Person.Looser) person).doNothing();
        }

    }

}
