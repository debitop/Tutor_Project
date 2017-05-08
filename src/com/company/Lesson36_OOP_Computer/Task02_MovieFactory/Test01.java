package com.company.Lesson36_OOP_Computer.Task02_MovieFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Саша on 02.05.2017.
 */
/* MovieFactory
1. Добавить абстрактный класс Movie с абстрактным методом String getGenre().
2. Добавить классы SoapOpera, Cartoon, Thriller и унаследовать их от Movie и реализовать метод String getGenre():
- в классе SoapOpera метод getGenre() должен вернуть строку "Genre is drama";
- в классе Cartoon метод getGenre() должен вернуть строку "Genre is comedy";
- в классе Thriller метод getGenre() должен вернуть строку "Genre is horror";
3. Создать класс MovieFactory с методом getMovie(String key)
4. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
5. Добавить в MovieFactory.getMovie получение объекта SoapOpera для ключа "soapOpera".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".

7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName() + movie.getGenre();.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         while (true){
             String s = reader.readLine();
             if (s.equals("cartoon") || s.equals("soapOpera") || s.equals("thriller")){
                 Movie movie=MovieFactory.getMovie(s);
                 System.out.println(movie.getClass().getSimpleName());
             }
             else break;
         }

    }
}
