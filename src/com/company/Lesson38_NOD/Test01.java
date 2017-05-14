package com.company.Lesson38_NOD;

/**
 * Created by Саша on 09.05.2017.
 */
public class Test01 {
    public static Integer variable = 1;

    public static void main(String[] args) {
        System.out.println(TestMeOneMoreTime.variable);
    }

}

class TestMeOneMoreTime extends Test01 {
    public static Integer variable = 2;
}
