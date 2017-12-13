package com.company.HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//вводим 5 слов и сортировка в алфавитном пор
public class Test_Sort_Slov {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String [] arr = new String[5];
        for (int i=0;i<arr.length; i++){
            arr[i]=reader.readLine();
        }
        sort(arr);
    }
    static void sort(String[] arr){

    }
}
