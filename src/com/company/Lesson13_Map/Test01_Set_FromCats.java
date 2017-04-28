package com.company.Lesson13_Map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Саша on 04.12.2016.
 */
/* Set из котов
1. Внутри класса создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/
public class Test01_Set_FromCats {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
/*        for (Cat cat : cats) {
            cats.remove(cat);
            break;
        }
        printCats(cats);
*/
//удалили один объект с помощью итератора
        Iterator<Cat> iterator = cats.iterator();
        int i = 0;
        while (iterator.hasNext()){
            iterator.next();
            if(cats.size() == cats.size()-i) {
                iterator.remove();
                i++;
            }
        }
        printCats(cats);
    }

    private static void printCats(Set cats){
        for (Object cat : cats) {
            System.out.println(cat);
        }
    }
    public static class Cat {
    }

    private static Set createCats() {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }
}
