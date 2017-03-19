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
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String glasnye = "";
        String soglasnye = "";
        char[] chars = s.toCharArray();

        for (int i=0; i<chars.length; i++){
            if (isVowels(chars[i])==true){
                glasnye += (chars[i] + " ");
            }
            else if (chars[i]==' ')
                continue;
            else soglasnye += (chars[i] + " ");
        }


        System.out.println(glasnye);
        System.out.println(soglasnye);
    }
    private static boolean isVowels(char vowel){
        for (int i=0; i<vowels.length; i++){
            if (vowel==vowels[i]){
                return true;
            }

        }
        return false;
    }
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};


}
