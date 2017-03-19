package Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Саша on 03.12.2016.
 */
//Дано целое число 1≤n≤40 , необходимо вычислить n-е число Фибоначчи
// (напомним, что F0=0, F1=1 и Fn=Fn−1+Fn−2 при n≥2).
public class stepic_algoritmy_2_2_6 {
    public static void main(String[] args) throws IOException {
        int[] array = new int[41];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < 41; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        System.out.println(array[num]);

    }


}
