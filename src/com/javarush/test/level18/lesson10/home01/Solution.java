package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        if (args.length < 1) return;

        FileInputStream file = new FileInputStream(args[0]);

        Set<Character> set = new HashSet<Character>();

        for (int i = (int)'a'; i <= 'z' ; i++)
        {
            set.add((char)i);
        }

        String line;
        int col = 0;
        while ( file.available() > 0){

            if (set.contains((char)file.read()))
                col++;

        }

//        System.out.println(set);
        System.out.println(col);
    }
}
