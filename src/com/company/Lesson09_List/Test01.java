package com.company.Lesson09_List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 20.11.2016.
 */
/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:

лира
лоза
Выходные данные:
лира
лоза
лоза
*/
// String s = "text23434fe";
//        if(s.contains("text")){

    //for (String  s: list) {} - forEach прохождение по элементам коллекции (iter)
public class Test01 {
    public static void main (String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);

        }

        list = fix(list);
        for (String s : list) {
            System.out.println(s);
        }
    }

    private static List<String> fix(List<String> list){
        List<String> array = new ArrayList<>();

        for (String s : list) {
            if (s.contains("р") && s.contains("л")) array.add(s);
            else if (s.contains("р"));
            else if (s.contains("л")) {
                array.add(s);
                array.add(s);
            }
            else array.add(s);
        }
        return array;
    }


}


