package com.company.Lesson43.Task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 18.06.2017.
 */
/* Разные методы для разных типов
0. Создать метод print и перегрузить его для разных типов:
- print( Double value ), должен выводит на экран надпись "Это тип Double, значение " + value
- print( String value ), должен выводит на экран надпись "Это тип String, значение " + value
- print( short value ), должен выводит на экран надпись "Это тип short, значение " + value
- print( Integer value ), должен выводит на экран надпись "Это тип Integer, значение " + value
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения, кроме "exit", вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String name = reader.readLine();
            try {
                if (name.equals("exit")) {
                    break;
                } else if (name.contains(".")) {
                    print(Double.parseDouble(name));
                } else {

                    int num = Integer.parseInt(name);
                    if (0 < num && num < 128) {
                        print((short) num);
                    } else if (num >= 128) {
                        print(num);
                    }
                }
            } catch (NumberFormatException e) {
                print(name);
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }

}
