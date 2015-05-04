package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> files = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null){

            if (line.isEmpty()) continue;
            if (line.equals("end")) break;

            files.add(line);

        }

        //Сортируем по имени
        System.out.println(files);
        Collections.sort(files);
        System.out.println(files);

//        if (true)
//        return;

        if (files.isEmpty()) return;
        String oFileName = files.get(0).replace(".part1", "");
        System.out.println(oFileName);

        FileOutputStream ofile = new FileOutputStream(oFileName);

        byte data[];
        for (String item : files){
            FileInputStream in = new FileInputStream(item);

            data = new byte[in.available()];
            in.read(data);
            in.close();

            ofile.write(data);


        }
        ofile.close();

    }
}
