package com.company.Lesson24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Саша on 07.03.2017.
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
public class test01 {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         while (true){
             String s = reader.readLine();
             if (s.isEmpty()) break;
             list.add(s);
         }
         list = fix(list);
        for (String s : list) {
            System.out.println(s);
        }

        }

    private static List<String> fix (List<String> list){
        List<String> list_p = new ArrayList<>();
      for (int i=0; i<list.size(); i++){
          if (list.get(i).contains("р")){}
          else if (list.get(i).contains("л")) {
              list_p.add(list.get(i));
              list_p.add(list.get(i));
          }
          else if (list.get(i).contains("р") && list.get(i).contains("л")){
              list_p.add(list.get(i));
          }
          else list_p.add(list.get(i));
      }
        return list_p;
    }
}
