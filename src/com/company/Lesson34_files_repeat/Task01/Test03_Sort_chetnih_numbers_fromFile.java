package com.company.Lesson34_files_repeat.Task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 18.04.2017.
 */
/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/
public class Test03_Sort_chetnih_numbers_fromFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));
        List<Integer> list = new ArrayList<>();
        String s = null;
        while ((s = fileReader.readLine()) != null) {
            int num = Integer.parseInt(s);
            if (num%2==0){
            list.add(num);}
        }
        for (int i=0; i<list.size(); i++){
            for (int j=0; j<list.size()-1; j++){
                int a = list.get(j);
                if (list.get(j+1)<list.get(j)){
                    list.set(j,list.get(j+1));
                    list.set(j+1,a);
                }
            }
        }
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
