package com.company.Lesson53_schitaem_seconds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Считаем секунды
1. Создать класс Stopwatch, унаследовать его от Thread.
2. В выполняющем классе ввести с клавиатуры строку
3. Напиши реализацию метода run в нити Stopwatch (секундомер).
4. Stopwatch должен посчитать количество секунд, которое прошло от создания нити до ввода строки.
5. Выведи количество секунд в консоль.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        Stopwatch stopwatch = new Stopwatch();
        InputStreamReader read2=new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(read2);
        stopwatch.start();
        String stroka = reader.readLine();
        stopwatch.interrupt();
      //  reader.close();
 //       read2.close();
     //   System.out.println(stopwatch.count);
    }
}
