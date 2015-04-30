package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();

        reader.close();

        FileInputStream file = new FileInputStream(filename);
        FileOutputStream file_out = new FileOutputStream(filename2);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (file.available() > 0){

            list.add(file.read());

        }
        Collections.reverse(list);

        for (Integer item : list)
            file_out.write(item);


    }
}
