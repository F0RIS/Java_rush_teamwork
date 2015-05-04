package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1,f2;

        f1 = reader.readLine();
        f2 = reader.readLine();
//        f1 = "d:\\1.txt";
//        f2 = "d:\\res.txt";

        BufferedReader in = new BufferedReader(new FileReader(f1));
        PrintWriter out = new PrintWriter(f2);

        String line;
        while ((line = in.readLine()) != null){

            String floats[] = line.split(" ");

            for (String s :floats)
            {
                out.write(Integer.toString(Math.round(Float.parseFloat(s))) + " ");
                System.out.print(Integer.toString(Math.round(Float.parseFloat(s))) + " ");
            }

        }

        out.close();

    }
}
