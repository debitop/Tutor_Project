package com.company.Lesson45.Task01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 04.07.2017.
 */
/* Файл в статическом блоке
1. Инициализируйте константу Constants.FILE_NAME полным путем к файлу с данными, который содержит несколько строк.
2. В статическом блоке считайте из файла с именем Constants.FILE_NAME все строки и добавьте их по-отдельности в List lines.
3. Отловите все исключения, которые могут возникнуть в программе.
3. Закройте поток ввода методом close().
4. В выполняющем методе выводите на экран все значения списка lines.
*/
public class Test01 {
    static List<String> lines = new ArrayList();

    static {
        BufferedReader readerFile = null;
        try {
            readerFile = new BufferedReader(new FileReader(Constants.FILE_NAME));
            String line = "";
            while ((line = readerFile.readLine()) != null){
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}
