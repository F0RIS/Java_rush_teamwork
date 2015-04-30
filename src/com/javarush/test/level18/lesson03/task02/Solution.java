package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        String filename =new BufferedReader(new InputStreamReader(System.in)).readLine();
        FileInputStream file = new FileInputStream(filename);

        int min = Integer.MAX_VALUE;

        while (file.available()>0){

            int temp = file.read();
            if (min > temp)
                min = temp;

        }
        file.close();

        System.out.println(min);

    }
}
