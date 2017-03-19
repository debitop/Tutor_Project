package com.company.Lesson14;


import java.util.HashSet;
import java.util.Set;

/**
 * Created by Саша on 06.12.2016.
 */
/* Множество всех животных
1. Внутри класса Solution создать public static классы Cat, Dog.
2. Реализовать метод createCats, котороый должен возвращать множество с 4 котами.
3. Реализовать метод createDogs, котороый должен возвращать множество с 3 собаками.
4. Реализовать метод join, котороый должен возвращать объединенное множество всех животных - всех котов и собак.
5. Реализовать метод removeCats, котороый должен удалять из множества pets всех котов, которые есть в множестве cats.
6. Реализовать метод printPets, котороый должен выводить на экран всех животных, которые в нем есть. Каждое животное с новой строки
*/
public class Test02 {
    public static void main(String[] args) {
        Set<Cat>setCats = createCats();
        Set<Dog>setDog = createDogs();
        Set<Object>setPets = join(setCats,setDog);
        remove(setPets,setCats);
        printPets(setPets);
    }
    static class Cat{}
    static class Dog{}

    private static Set createCats(){
        Set<Cat>set = new HashSet<>();
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }
    private static Set createDogs(){
        Set<Dog>set = new HashSet<>();
        set.add(new Dog());
        set.add(new Dog());
        set.add(new Dog());
        return set;
    }
    private static Set join(Set cat, Set dog){
        Set<Object>pets = new HashSet<>();
        pets.addAll(cat);
        pets.addAll(dog);
        return pets;

    }
    private static void remove(Set pets, Set cat){
        pets.removeAll(cat);

    }
    private static void printPets(Set pets){
        for (Object pet : pets) {
            System.out.println(pet);
        }
    }
}
