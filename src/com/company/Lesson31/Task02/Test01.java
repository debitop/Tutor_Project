package com.company.Lesson31.Task02;

/**
 * Created by Саша on 04.04.2017.
 */
/* Погода
1. Создать интерфейс Weather с методом getWeatherType().
2. Создать интерфейс WeatherType с перечнем погодных условий.
3. В классе Today реализовать интерфейс Weather.
4. В классе Today создать переменную String type;
5. Подумай, как связан параметр String type с методом getWeatherType().
6. Переопределить метод toString() в классе Today, что бы он выводил на экран надпись %s for today, где %s - тип погоды
*/
public class Test01 {
    public static void main(String[] args) {
        Today day = new Today(WeatherType.CLOUDY);
        Today day2 = new Today(WeatherType.WINDY);
        Today day3 = new Today(WeatherType.FOGGY);
        System.out.println(day);
        System.out.println(day2);
        System.out.println(day3);
    }
}
