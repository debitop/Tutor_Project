package com.company.Lesson14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 06.12.2016.
 */
/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.

Имя: ded Ivan, пол: мужской, возраст: 70, дети: mama Lena
        Имя: baba Masha, пол: женский, возраст: 65, дети: mama Lena
        Имя: ded Ivan, пол: мужской, возраст: 70, дети: papa Fedya
        Имя: baba Masha, пол: женский, возраст: 65, дети: papa Fedya
        Имя: papa Fedya, пол: мужской, возраст: 40, дети: son Lesha, son Misha, daughter Masha
        Имя: mama Lena, пол: женский, возраст: 35, дети: son Lesha, son Misha, daughter Masha
        Имя: son Lesha, пол: мужской, возраст: 15
        Имя: son Misha, пол: мужской, возраст: 10
        Имя: daughter Masha, пол: женский, возраст: 5
*/
public class Test05_ClassFamily {
    public static void main(String[] args) {
        Human child1 = new Human("ребенок Паша", true, 12, new ArrayList<>());
        Human child2 = new Human("ребенок Гриша", true, 13, new ArrayList<>());
        Human child3 = new Human("ребенок Маша", false, 10, new ArrayList<>());

        List<Human> childL1 = new ArrayList<>();
        childL1.add(child1);
        childL1.add(child2);
        childL1.add(child3);

        Human father = new Human("papa Sasha", true, 37, childL1);
        Human mother = new Human("mama Vika", false, 33, childL1);

        List<Human> childL2 = new ArrayList<>();
        childL2.add(father);
        childL2.add(mother);

        Human gFather = new Human("Ded Ivan", true, 63, childL2);
        Human gFather2 = new Human("Ded Misha", true, 60, childL2);
        Human gMother = new Human("Babka Katia", false, 55, childL2);
        Human gMother2 = new Human("Babka Olia", false, 57, childL2);


        System.out.println(gFather);
        System.out.println(gMother);
        System.out.println(gFather2);
        System.out.println(gMother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    static class Human {
        String name;
        boolean pol;
        int age;
        List<Human> child;

        Human(String name, boolean pol, int age, List<Human> child) {
            this.age = age;
            this.name = name;
            this.pol = pol;
            this.child = child;
        }

        @Override
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += " пол: " + (this.pol ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            int childCount = child.size();
            if (childCount > 0) {
                text += ", дети: " + this.child.get(0).name;
                for (int i = 1; i < child.size(); i++) {
                    text += ", " + this.child.get(i).name;
                }

            }
            return text;
        }
    }

}
