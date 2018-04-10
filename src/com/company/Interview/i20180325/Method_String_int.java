package com.company.Interview.i20180325;

import java.util.Objects;

public class Method_String_int {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("111", 111);
        met1(myClass);
    }

    static MyClass met1(MyClass myClass) {
        return myClass;

    }
}

class MyClass {
    String st;
    Integer num;

    public MyClass(String st, int num) {
        this.st = st;
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(st, myClass.st) &&
                Objects.equals(num, myClass.num);
    }

    @Override
    public int hashCode() {

        return Objects.hash(st, num);
    }
}

