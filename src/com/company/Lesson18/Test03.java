package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 20.12.2016.
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String vvod = reader.readLine();
        char[] chars = vvod.toCharArray();
        String vowel = "";
        String consonants = "";
        for (int i = 0; i < chars.length; i++) {
            if (isVowels(chars[i])) {
                vowel += chars[i] + " ";
            } else if (chars[i]!=' ') {consonants += chars[i] + " ";}
        }



        System.out.println(vowel);
        System.out.println(consonants);}
    //consonans


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowels(char chars) {
        for (int i = 0; i < vowels.length; i++) {
            if (chars == vowels[i]){
                return true;
            }
        }
        return false;
    }
}
