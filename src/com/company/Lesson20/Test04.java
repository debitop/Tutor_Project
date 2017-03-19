package com.company.Lesson20;

import java.io.*;

/**
 * Created by Саша on 10.01.2017.
 */ // Copies data in file
public class Test04 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inputStream = new FileInputStream(reader.readLine()); // для чтения с файла (по байтам)
        OutputStream outputStream = new FileOutputStream(reader.readLine()); // для записи в файл (по байтам)

        int count = 0;

        while(inputStream.available() > 0){
            int data = inputStream.read();
            outputStream.write(data);
            count++;
        }

        System.out.println("Copies byte: " + count);
    }
}
