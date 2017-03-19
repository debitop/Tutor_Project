package com.company.Lesson11;

import java.util.Date;

/**
 * Created by Саша on 27.11.2016.
 */
public class TestDate01 {
    public static void main(String[] args) throws InterruptedException {
        Date today = new Date();
        System.out.println(today);
        System.out.println(today.getTime());
        System.out.println(today.getMonth());

        Date date1 = new Date();
        date1.setYear(107);
        System.out.println(date1);


        long msDistance = date1.getTime() - today.getTime();
        System.out.println(msDistance);

        Thread.sleep(3000);
    }
}
