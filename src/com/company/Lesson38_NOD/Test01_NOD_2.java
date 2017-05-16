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
public class Test01_NOD_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());
        System.out.println(maxDiv(num1, num2));
    }

//    public static int nod(int num1, int num2) {
//        int a = num2;
//        if (num1 < num2) {
//            a = num1;
//            num1 = num2;
//        }
//        while (num1 % a != 0) {
//            a--;
//            while (num2 % a != 0) {
//                a--;
//            }
//        }
//
//        return a;
//    }
public static int maxDiv(int w, int q)  {
    int c = 0;
    int i = 1;
    while (i <= q && i <= w)
    {
        if ((q % i) == 0 && (w % i) == 0)
        {
            c = i;
            i++;
        } else
            i++;
    }
    return c;
}






}
