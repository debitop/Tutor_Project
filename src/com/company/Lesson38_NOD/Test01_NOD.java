package com.company.Lesson38_NOD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 14.05.2017.
 */
/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/
public class Test01_NOD {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println(nod(num1, num2));
    }

    public static int nod(int num1, int num2) {
        int a = num2;
        if (num1 < num2) {
            a = num1;
            num1 = num2;
        }
        while (num1 % a != 0) {
            a--;
            while (num2 % a != 0) {
                a--;
            }
        }

        return a;
    }

}
