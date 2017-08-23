package com.company.Lesson46_Thread;

public class Test01 {

    public static void main(String[] args) {
        E e = new E();
        T t = new T();
        Y y = new Y();

        t=y;
       // t=e;
       // t=(T)e; classCast
       // t=(E)e; ошибка компил
       // t=(Y)y;
        t=(T)t;

        System.out.println(e);
    }
}

class E {
    public void m() {

    }
}

class T extends E {
    public void m1() {

    }
}

class Y extends T {
    public void m2() {

    }





}
