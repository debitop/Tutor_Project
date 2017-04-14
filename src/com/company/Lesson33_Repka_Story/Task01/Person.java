package com.company.Lesson33_Repka_Story.Task01;

/**
 * Created by Саша on 14.04.2017.
 */
/*
1. Создать классы Person, RepkaStory и интерфейс RepkaItem
2. В интерфейсе RepkaItem создать метод String getNamePadezh();
3. Реализовать интерфейс RepkaItem в классе Person.
5. В классе Person создать переменные  String name, String namePadezh;
6. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'. Пример:
Бабка за Дедку
Дедка за Репку
7. Создать метод tell в классе RepkaStory.
8. С помощью цикла реализовать метод tell, который должен віполнять логику вывода на экран с помощью метода pull(Person person)
9. Выполнить метод main
 List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
*/
public class Person implements RepkaItem{
   private String name;
   private String namePadezh;

    public Person(String name, String namePadezh) {
        this.name = name;
        this.namePadezh = namePadezh;
    }

    void pull (Person person){
       System.out.println(this.name + " за " + person.getNamePadezh());
   }

    @Override
    public String getNamePadezh() {
        return namePadezh;
    }
}
