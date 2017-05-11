package com.company.Lesson17_Exception_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 18.12.2016.
 */
/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader-а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа,
то метод должен перехватить исключение и вывести на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/
public class Test05_metod_in_try_catch {
    public static void main(String[] args) throws IOException {
        readData();
    }

    private static void readData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                String s = reader.readLine();
                if (s.isEmpty()) break;
                int num = Integer.parseInt(s);
                list.add(num);
            } catch (NumberFormatException e) {
                for (Integer integer : list) {
                    System.out.println(integer);
                }
            }

        }
    }
}
