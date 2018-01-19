package com.company.Lesson05_Cycle;

/**
 * Created by Саша on 06.11.2016.
 */
/*
Создать класс Cat с параметрами: name, age, power
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от силы.
Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/
public class Test01 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", 4, 6);
        Cat cat2 = new Cat("murzik", 3, 6);
       if (cat1.fight(cat2)) System.out.println("win is " + cat1.name);
        else System.out.println("win is " + cat2.name);


    }
    public static class Cat{
        String name;
        int age;
        int power;

        Cat (String n, int a, int p){
            this.name = n;
            this.age = a;
            this.power = p;
        }

         boolean fight (Cat anotherCat){
            return this.power > anotherCat.power;
        }
    }
}
