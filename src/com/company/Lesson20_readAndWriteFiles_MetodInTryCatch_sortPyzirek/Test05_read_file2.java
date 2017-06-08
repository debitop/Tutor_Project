package com.company.Lesson20_readAndWriteFiles_MetodInTryCatch_sortPyzirek;

import java.io.*;

/**
 * Created by Саша on 10.01.2017.
 */
public class Test05_read_file2 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        InputStream inputStream = new FileInputStream(reader.readLine());
        OutputStream outputStream = new FileOutputStream(reader.readLine());
        int count=0;
        while (inputStream.available()>0){
            int data = inputStream.read();
            outputStream.write(data);
            System.out.println(data);
            count++;
        }
        System.out.println(count);


    }
}
