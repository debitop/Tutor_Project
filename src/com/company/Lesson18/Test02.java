package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 20.12.2016.
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
        String vvod = reader.readLine();
        char[] chars = vvod.toCharArray();
        String vowel = "";
        String consonants = "";

        for (int i = 0; i < chars.length; i++) {
            char s = 0;
            for (int j = 0; j < vowels.length; j++) {
                if (chars[i] == vowels[j]) {
                    s = vowels[j];
                    vowel += chars[i] + " ";
                }
            }

            if(chars[i] == s || chars[i] == ' '){
               continue;
            }

            consonants += chars[i] + " ";
        }
        System.out.println(vowel);
        System.out.println(consonants);
        //consonans

    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
}
