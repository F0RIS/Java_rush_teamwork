package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));
        FileOutputStream file2 = new FileOutputStream(reader.readLine());


        while (file1.ready()){
            String line = file1.readLine();

            String words[] = line.split(" ");
            for (String s : words){
                try{
                    int x = Integer.parseInt(s);
                    //System.out.println(x);
                    file2.write((s + " ").getBytes());
                }catch (NumberFormatException e){
                    e.getMessage();
//                    System.out.println("error");
                }


            }

        }

        file1.close();
        file2.close();
/*
d:\1.txt
d:\2.txt
 */

    }
}
