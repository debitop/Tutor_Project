package com.company.Lesson11;

import java.util.Date;

/**
 * Created by Саша on 27.11.2016.
 */
//Вычисление разницы между двумя датами
public class TestDate02 {
    public static void main(String[] args) throws InterruptedException {
        Date time1 = new Date();
        Thread.sleep(3000);
        Date time2 = new Date();
        long msDistance = time2.getTime()-time1.getTime();
        System.out.println(msDistance);
    }
}
