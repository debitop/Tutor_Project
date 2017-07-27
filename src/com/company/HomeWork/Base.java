package com.company.HomeWork;

public     class Base {
         void fPrivate() {
            System.out.println("f Private");
        }

        public static void fun(Base t) {
            t.fPrivate();
        }
    }

     class Derived1 extends Base {
        public static void main(String args[]) {
            Base a = new Derived1();            //1
            a.fPrivate();                      //2
            Base.fun(a);                       //3
        }
         void fPrivate() {
            System.out.println("b Private");
        }
    }

