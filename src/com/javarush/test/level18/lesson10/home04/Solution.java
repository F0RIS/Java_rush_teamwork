package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1,f2;

        f1 = reader.readLine();
        f2 = reader.readLine();


        FileInputStream file1 = new FileInputStream(f1);

        byte[] bf1 = new byte[(int) file1.available()];

        file1.read(bf1);
        file1.close();

        FileOutputStream out = new FileOutputStream(f1);
        FileInputStream in = new FileInputStream(f2);

        while (in.available()>0)
        {
            int data = in.read();

            out.write(data);

        }

        out.write(bf1);
        out.close();

    }
}
