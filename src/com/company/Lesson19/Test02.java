package com.company.Lesson19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 08.01.2017.
 */
/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.
public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String glasnye = "";
        String soglasnye = "";
        char[] chars = s.toCharArray();
        char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
        for (int i = 0; i < chars.length; i++) {
            int count = 0;
            for (int j = 0; j < vowels.length; j++) {

                if (chars[i] == vowels[j]) {
                    glasnye += (chars[i] + " ");
                    count++;
                }

            }
            if (count == 0 && chars[i] != ' ') {
                soglasnye += (chars[i] + " ");
            }
        }
        System.out.println(glasnye);
        System.out.println(soglasnye);
    }


}
