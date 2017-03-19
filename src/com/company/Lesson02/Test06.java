package com.company.Lesson02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись:
 * «Имя» получает «число1» через «число2» лет.
 * <p>
 * Пример:
 * Коля получает 3000 через 5 лет.
 * Created by Саша on 25.10.2016.
 */


public class Test06 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String s = reader.readLine();
        System.out.println("Введите число 1");
        int number1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите число 2");
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(s + " получает " + number1 + "$ через " + number2 + " лет.");

    }

}

