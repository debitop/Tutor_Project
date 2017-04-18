package com.company.Lesson34_files_repeat.Task01;

import java.io.*;

/**
 * Created by Саша on 18.04.2017.
 */
/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Если файла по заданному пути не существует, запросить ввод имени файла еще раз.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream;
        while (true) {
            try {

                inputStream = new FileInputStream(reader.readLine());
                break;
            } catch (FileNotFoundException e) {
                System.out.println("путь не верный ");
            }
        }
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            System.out.print((char) data);
        }

        inputStream.close();
    }
}
