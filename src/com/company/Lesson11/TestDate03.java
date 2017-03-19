package com.company.Lesson11;

import java.util.Date;

/**
 * Created by Саша on 27.11.2016.
 */
//Сколько прошло времени с начала сегодняшнего дня в формате часы: мин: сек
public class TestDate03 {
    public static void main(String[] args) {


        Date today = new Date();
        int hour = today.getHours();
        int min = today.getMinutes();
        int sek = today.getSeconds();
        System.out.println(hour + ":" + min + ":" + sek);
    }
}
