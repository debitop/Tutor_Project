package com.company.Lesson26;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 14.03.2017.
 */
/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
*/
public class Test02_Family {
    public static void main(String[] args) {
        List<Human> list = new ArrayList<>();
        Human child01 = new Human("Маша", false, 14, null);
        Human child02 = new Human("Максим", true, 12, null);
        Human child03 = new Human("Рита", false, 10, null);
        list.add(child01);
        list.add(child02);
        list.add(child03);
        Human father = new Human("папаВова", true, 38, list);
        Human mother = new Human("мамаОля", false, 37, list);
        List<Human> list1 = new ArrayList<>();
        List<Human> list2 = new ArrayList<>();
        list1.add(father);
        list2.add(mother);
        Human gFather1 = new Human("дедВася", true, 66, list1);
        Human gFather2 = new Human("дедПетя", true, 66, list2);
        Human gMother1 = new Human("бабкаМаша", false, 68, list1);
        Human gMother2 = new Human("бабкаВаля", false, 60, list2);
        System.out.println(child01);
        System.out.println(child02);
        System.out.println(child03);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(gFather1);
        System.out.println(gFather2);
        System.out.println(gMother1);
        System.out.println(gMother2);

    }

    public static class Human {
        String name;
        boolean pol;
        int age;
        List<Human> children;

        public Human(String name, boolean pol, int age, List<Human> children) {
            this.name = name;
            this.pol = pol;
            this.age = age;
            this.children = children;
        }

        @Override
        public String toString() {
            String text = "";
            text+="имя: "+this.name;
            text+=", пол: "+(this.pol?"мужской":"женский");
            text+=", возраст: "+this.age;
            if (this.children!=null){
                text+=", дети: "+children.get(0).name;
                for (int i=1; i<children.size();i++){
                    text+=", "+children.get(i).name;
                }

            }


            return text;
        }
    }


}
