package com.company.HomeWork;

import java.util.HashSet;
import java.util.Set;

// [0](LinkedList<Entry>) [1](LinkedList<Entry> 1) [2](LinkedList<Entry> entry2, entry4, entry6) [] [] ... //  16 -> 32 -> 64      //loadFactor=0.75

// 2 "gerg"
// 1 "fwefwe"
// 10 "fewffe"
// 7 "fergerg"
// 2 "fregrw"
// 4
// 6

 class Heshcodee {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User(1, 2, 2));
        set.add(new User(1, 2, 2));
        for (User user : set) {
            System.out.println(user);
           // String
        }

        Set<Integer> setInt = new HashSet<>();
        setInt.add(1);
        setInt.add(2);
        setInt.add(3);
        setInt.add(4);
        setInt.add(5);
        setInt.add(6);
        setInt.add(7);
        setInt.add(20);
        setInt.add(36);


        for (Integer integer : setInt) {
            System.out.println(integer);
        }
    }
}

class User{
    int a;
    int b;
    int c;

    public User(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (a != user.a) return false;
        if (b != user.b) return false;
        return c == user.c;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        result = 31 * result + c;
        return result;
    }
}

abstract class Abstract{
    private void m(){
        System.out.println("Error!");
    }

    public final void method(){
        System.out.println("fwf");
        m();
        System.out.println();
    }
}