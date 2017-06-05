package com.company.Lesson41.Task01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 05.06.2017.
 */
/* Статики
1. В статическом блоке считайте две переменные с консоли number1 и number2 с типом int.
2. Не забыть про IOException, который надо обработать в блоке catch.
3. Закрыть поток ввода методом close().
4. Создать метод min(int a, int b), который должен вернуть минимальное значение между number1 и number2.
5. Создать статическую, неизменяемую переменную MIN и присвоить ей значение, которое возвращает метод min.
6. В выполняющем методе вывести значение переменной MIN.
*/
public class Test01 {
    static {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            //try with resours - try сам закрывает используемые ресурсы
            int number1 = Integer.parseInt(reader.readLine());
            int number2 = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }
}
