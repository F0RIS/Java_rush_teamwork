package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String f1,f2,f3;

        f1 = reader.readLine();
        f2 = reader.readLine();
        f3 = reader.readLine();

        FileOutputStream file1 = new FileOutputStream(f1);
        FileInputStream file2 = new FileInputStream(f2);
        FileInputStream file3 = new FileInputStream(f3);

        byte buf[] = new byte[1000];
        while (file2.available() > 0){
            int count = file2.read(buf);
            file1.write(buf,0,count);

        }

        while (file3.available() > 0){
            int count = file3.read(buf);
            file1.write(buf,0,count);

        }

        file1.close();
        file2.close();
        file3.close();
    }
}
