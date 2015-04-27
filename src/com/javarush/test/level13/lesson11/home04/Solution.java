package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String filename = reader.readLine();
//        String filename = "d:\\222.txt";

        PrintWriter wr = new PrintWriter(filename);

        String line ;
        while (true){

            line = reader.readLine();



            wr.write(line+"\n");

            if (line.equals("exit"))
                break;
        }

        wr.close();
        reader.close();


    }
}
