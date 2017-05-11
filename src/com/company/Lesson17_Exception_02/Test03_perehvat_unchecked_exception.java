package com.company.Lesson17_Exception_02;

/**
 * Created by Саша on 18.12.2016.
 */
/* Перехват unchecked исключений
В методе processExceptions обработайте все unchecked исключения.
Нужно вывести стек-трейс каждого возникшего исключения используя метод printStack.
Можно использовать только один блок try..
NullPointerException, ArithmeticException, ArrayIndexOutOfBoundsException
*/
public class Test03_perehvat_unchecked_exception {
    public static void main(String[] args) {
        processExceptions();
    }

    private static void processExceptions() {
        try {
            exept1();
        } catch (NullPointerException e) {
            printStack(e);
        }
        try {
            exept2();
        } catch (ArithmeticException e) {
            printStack(e);
        }
        try {
            exept3();
        } catch (ArrayIndexOutOfBoundsException e) {
            printStack(e);
        }
    }

    private static void exept1() {
        throw new NullPointerException();
    }

    private static void exept2() {
        throw new ArithmeticException();
    }

    private static void exept3() {
        throw new ArrayIndexOutOfBoundsException();
    }

    private static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }
}
