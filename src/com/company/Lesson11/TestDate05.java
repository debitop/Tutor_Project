package com.company.Lesson11;

import java.util.Date;

/**
 * Created by Саша on 27.11.2016.
 */
//Сколько дней прошло с начала года
public class TestDate05 {
    public static void main(String[] args) {
        Date today = new Date();
        Date time1 = new Date();
        time1.setMonth(0);
        time1.setDate(0);
        time1.setHours(0);
        time1.setMinutes(0);
        time1.setSeconds(0);
        long perem = today.getTime()-time1.getTime();
        //сколько милисекунд в одних сутках
        long sek = 1000*60*60*24;

        System.out.println(perem/sek);
    }
}
