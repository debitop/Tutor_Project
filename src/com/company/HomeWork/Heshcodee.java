package com.company.HomeWork;

import java.util.HashSet;
import java.util.Set;

public class Heshcodee {
    public static void main(String[] args) {
        Set<User> set = new HashSet<>();
        set.add(new User(1, 2, 2));
        set.add(new User(2, 2, 2));
        for (User user : set) {
            System.out.println(user);
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
        return b == user.b;
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