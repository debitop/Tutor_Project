package com.company.Lesson34_files_repeat.Task01;

import java.io.*;

/**
 * Created by Саша on 18.04.2017.
 */
/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/
public class Test02 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        while (true){
            String name = reader.readLine();
            outputStream.write((name + "\n").getBytes());
            if ("exit".equals(name)) {
                break;
            }
        }

    }
}
