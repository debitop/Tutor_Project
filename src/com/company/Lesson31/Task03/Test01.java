package com.company.Lesson31.Task03;

/**
 * Created by Саша on 04.04.2017.
 */
//        For s = "CodefightsIsAwesome", the output should be
//        amendTheSentence(s) = "codefights is awesome";
//        For s = "Hello", the output should be
//        amendTheSentence(s) = "hello".
public class Test01 {
    public static void main(String[] args) {
        String s = "CodefightsIsAwesome";
        s = amendTheSentence(s);
        System.out.println(s);
    }


    public static String amendTheSentence(String s) {
        char[] chars = s.toCharArray();
        String stroka = "" + chars[0];
        // String stroka = String.valueOf(chars[0]);
        for (int i = 1; i < chars.length; i++) {

            if (Character.isUpperCase(chars[i])) {
                stroka = stroka + " ";
            }
            stroka = stroka + chars[i];
        }
        stroka=stroka.toLowerCase();
        return stroka;
    }
}
