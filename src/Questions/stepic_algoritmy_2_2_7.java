package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by Саша on 03.12.2016.
 */
//Дано число 1≤n≤10*7 , необходимо найти последнюю цифру nn-го числа Фибоначчи.
/*
Как мы помним, числа Фибоначчи растут очень быстро, поэтому при их вычислении нужно быть аккуратным с переполнением.
В данной задаче, впрочем, этой проблемы можно избежать, поскольку нас интересует только последняя цифра числа
Фибоначчи: если 0≤a,b≤9 0≤a,b≤9 — последние цифры чисел FiFi и Fi+1Fi+1 соответственно,
то (a+b)mod10(a+b)mod10 — последняя цифра числа Fi+2Fi+2.

*/
public class stepic_algoritmy_2_2_7 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        list.add(0,  0);
        list.add(1,  1);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        for (int i = 2; i < num+1; i++) {
            list.add( i,(list.get(i - 1) + list.get(i - 2)) % 10);
        }


        System.out.println(list.get(num));

    }


}
