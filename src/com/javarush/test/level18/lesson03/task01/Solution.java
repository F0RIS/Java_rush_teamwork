package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* Максимальный байт
Ввести с консоли имя файла
Найти максимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        String filename =new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream file = new FileInputStream(filename);

        int max = 0;

        while (file.available()>0){

            int temp = file.read();
            if (max <temp)
                max = temp;

        }
        file.close();

        System.out.println(max);
    }
}
