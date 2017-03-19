package com.company.Lesson16;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Саша on 13.12.2016.
 */
/* Исключения
Есть метод, который выбрасывает два исключения, унаследованные от Exception, и два унаследованных от RuntimeException:
NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException.

Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
ArithmeticException и URISyntaxException.
*/
public class Test_Exception7 {
    public static void main(String[] args) throws URISyntaxException {
        try {
            metod();
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }

    private static void metod() throws FileNotFoundException, URISyntaxException {
        int a = (int) (Math.random() * 4 + 1);
//        Exception[] array = {new NullPointerException(), new ArithmeticException(), new FileNotFoundException(), new URISyntaxException("","")};
//        throw array[a];
        if (a == 1) {
            throw new NullPointerException();
        } else if (a == 2) {
            throw new FileNotFoundException();
        } else if (a == 3) {
            throw new ArithmeticException();
        } else {
            throw new URISyntaxException("", "");
        }
    }
}
