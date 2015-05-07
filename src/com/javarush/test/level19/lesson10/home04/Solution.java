package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine()),"UTF8"));
//        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream("d:\\1.txt"),"UTF8"));

        String line;

        TreeMap<String, Double> map = new TreeMap<>();
        String s[];
        while ((line = file.readLine()) != null)
        {

            int col = 0;
            if (!line.isEmpty())
            {
                s = line.split(" ");


                for (int i = 0; i < s.length; i++)
                {
                    for (String word: words)
                        if (s[i].equals(word))
                            col++;
                }


            }
            if (col == 2) System.out.println(line);
        }


    }
}
