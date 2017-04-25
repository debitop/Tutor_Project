package com.company.Quisfull;

/**
 * Created by Саша on 25.04.2017.
 */
//не хватает ретурна
    // Код не компилируется из-за строки 2 и 3
public class Test01 {
//    class A<T1, T2>{        //1
//        public <T1> fun(){} //2
//        public <T2> fun(){} //3
    //   }

    public static void main(String[] args) {

    }
}

class Main{

    public static void main(String...args){
        C c = new C();

    }

}
class A{
    {
        System.out.println("non static A1");
    }
    A(){
        System.out.println("A");
    }
}
class B extends A{
    static{
        System.out.println("static B1");
    }
    B(){
        super();
        System.out.println("B");
    }
}
class C extends B{
    static{
        System.out.println("static C1");
    }
    {
        System.out.println("non static C1");
    }
    C(){ //1
        this("Hello");
        System.out.println("C1");
    }
    C(String str){
        super();
        System.out.println("C2");
    }
    {
        System.out.println("non static C2");
    }
}

class Base {
    static {
        System.out.println("Static");
    }
    public Base(String s) {
        System.out.println("Base " + s);
    }
}

class Sub extends Base {
    private final static String Str = "Constructor";
    public Sub() {
        super(Str);
        System.out.println("Sub " + Str);
    }

    public static void main(String...args) {
        Base B = new Sub();
    }
}


/////////////////////////////////////////


class LinkageTest{

    public static class Parent{

        public void test(){
            System.out.println("parent::test");
        }
    }

    public static class Child extends Parent{

        public void test(){
            System.out.println("child::test");
        }
    }

    public static class Tester{

        public void test(Parent obj){
            System.out.println("Testing parent...");
            obj.test();
        }

        public void test(Child obj){
            System.out.println("Testing child...");
            obj.test();
        }
    }

    public static void main(String[] args){
        Parent obj = new Parent();
        Tester t = new Tester();
        t.test(obj);
    }
}

class O{
    O(int i){ //1
    }


}
class P extends O{
    P(int i) {
        super(i);
    } //2

}