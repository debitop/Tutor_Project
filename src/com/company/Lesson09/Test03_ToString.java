package com.company.Lesson09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Саша on 20.11.2016.
 */
/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
public class Test03_ToString {
    public static void main(String[] args) {
        Human gFather = new Human("Ded Ivan", true, 63, null, null);
        Human gFather2 = new Human("Ded Misha", true, 60, null, null);
        Human gMother = new Human("Babka Katia", false, 55, null, null);
        Human gMother2 = new Human("Babka Olia", false, 57, null, null);
        Human father = new Human("papa Sasha", true, 37, gFather, gMother);
        Human mother = new Human("mama Vika", false, 33, gFather2, gMother2);
        Human child1 = new Human("ребенок Паша", true, 12, father, mother);
        Human child2 = new Human("ребенок Гриша", true, 13, father, mother);
        Human child3 = new Human("ребенок Маша", false, 10, father, mother);
        List<Human>list = new ArrayList<>();
      //  Collections.addAll(list, )
        list.add(gFather);
        list.add(gFather2);
        list.add(gMother);
        list.add(gMother2);
        list.add(father);
        list.add(mother);
        list.add(child1);
        list.add(child2);
        list.add(child3);

        for (Human human : list) {
            System.out.println(human);
        }
    }
    public static class Human{
        String name;
        Boolean pol;
        int age;
        Human father;
        Human mother;

        public Human(String name, Boolean pol, int age, Human father, Human mother) {
            this.name = name;
            this.pol = pol;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;

            text += ", пол: " + (this.pol ? "мужской" : "женский");

//            if (this.pol) text += ", пол: мужской, ";
//            else text += ", пол: женский, ";

            text += ", возраст: "+ this.age;
            if (this.father != null) text += ", отец: " + this.father.name;
            if (this.mother != null) text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
