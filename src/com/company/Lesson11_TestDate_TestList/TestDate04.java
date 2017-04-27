package com.company.Lesson11_TestDate_TestList;

import java.util.Date;

/**
 * Created by Саша on 27.11.2016.
 */
public class TestDate04 {
    public static void main(String[] args) throws InterruptedException {
        Date startDate = new Date();
        long endTime = startDate.getTime() + 5000;
        Date endDate = new Date(endTime);

        Thread.sleep(6000);

        Date currentDate = new Date();

        if(currentDate.after(endDate)){
            System.out.println("We lose!");
        } else {
            System.out.println("We win!");
        }
    }
}
