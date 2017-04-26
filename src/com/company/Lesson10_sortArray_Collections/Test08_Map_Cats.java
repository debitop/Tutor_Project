package com.company.Lesson10_sortArray_Collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Саша on 22.11.2016.
 */
/* Коллекция HashMap из котов
Есть класс Cat с полем имя (name, String).
Создать коллекцию HashMap<String, Cat>.
Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота из массива:
 String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи"};
 В качестве значения использовать экземпляр кота, с переданным именем из массива в конструктор.
 В классе Cat метод toString() должен переводить переданное в конструктор имя в верхний регистр ( метод toUpperCase() )
Вывести результат на экран, каждый элемент с новой строки.
Вывести результат на экран в виде:
васька - ВАСЬКА
мурка - МУРКА
...
*/
public class Test08_Map_Cats {
    public static void main(String[] args) {
        Map<String, Cat> map = new HashMap<>();
        String[] cats = new String[] {"васька", "мурка", "дымка", "рыжик", "серый", "снежок", "босс", "борис", "визя", "гарфи", null};
        for (String cat : cats) {
            map.put(cat, new Cat(cat));
        }
        for (Map.Entry<String, Cat> pr : map.entrySet()) {
            String key = pr.getKey();
            Cat value = pr.getValue();
            System.out.println(key + " - " + value);
        }

    }
    private static class Cat  {
        String name;
        Cat(String n){
            this.name=n;
        }

        @Override
        public String toString() {
//            if (this.name != null){
//                return this.name.toUpperCase();
//            }
//            else return null;
            return this.name != null ? name.toUpperCase() : null;
        }
    }
}
