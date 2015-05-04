package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String filenme= "d:\\bd.txt";
        String filenme= reader.readLine();

        BufferedReader file = new BufferedReader(new FileReader(filenme));

        String line;
        while ((line = file.readLine()) != null){

           if (line.isEmpty()) continue;;

            String attrs[] = line.split(" ");

            if (attrs[0].equals(args[0])){
                System.out.println(line);

            }

        }


    }
}
