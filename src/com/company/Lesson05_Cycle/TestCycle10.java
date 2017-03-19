package com.company.Lesson05_Cycle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 06.11.2016.
 */
/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/
public class TestCycle10 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num;
        int sum = 0;
        do {
            num = Integer.parseInt(reader.readLine());
            sum = sum + num;
        } while (num != -1);
        System.out.println(sum);
    }
}
