package com.company.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 14.03.2017.
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
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] chars = text.toCharArray();
        String vowel = "";
        String cons = "";
        for (int i = 0; i < chars.length; i++) {
            if (isVowels(chars[i])) {
                //vowel = vowel + " " + chars[i];
                vowel += chars[i] + " ";
            } else if (chars[i] == ' ') {
                continue;
            } else cons = cons + chars[i] + " ";
        }

        System.out.println(vowel);
        System.out.println(cons);
    }

    private static boolean isVowels(char x) {
        x = Character.toLowerCase(x);
        char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
        for (int i = 0; i < vowels.length; i++) {
            if (x == vowels[i]) {
                return true;
            }
        }
        return false;
    }
}
