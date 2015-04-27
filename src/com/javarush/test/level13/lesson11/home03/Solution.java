package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename = reader.readLine();
//        String filename = "d:\\111.txt";
        BufferedReader file = new BufferedReader(new FileReader(filename));

        while (file.ready()){
            System.out.println(file.readLine());
        }

        file.close();
        reader.close();


    }
}
