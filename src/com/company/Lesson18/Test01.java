package com.company.Lesson18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/**
 * Created by Саша on 20.12.2016.
 */
/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        Date today;

        while (true) {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                today = new Date(reader.readLine());
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Повторите ввод");
            }
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMMM dd, yyyy", Locale.CANADA);
        System.out.println(simpleDateFormat.format(today).toUpperCase());
    }
}
