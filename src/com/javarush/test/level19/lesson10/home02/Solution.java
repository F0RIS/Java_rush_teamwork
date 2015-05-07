package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader file = new BufferedReader(new FileReader(args[0]));
//        BufferedReader file = new BufferedReader(new FileReader("d:\\1.txt"));


        String line;

        TreeMap<String, Double> map = new TreeMap<>();
        String s[];
        while ((line = file.readLine()) != null){

            s = line.split(" ");
            if (!map.containsKey(s[0])){
                map.put(s[0],Double.parseDouble(s[1]));
            }
            else
            {
                map.put(s[0], map.get(s[0]) + Double.parseDouble(s[1]));
            }


        }

        Double maxval = 0.0;
        for (Map.Entry<String, Double> item : map.entrySet())
            if (maxval < item.getValue())
                maxval = item.getValue();

        for (Map.Entry<String, Double> item : map.entrySet())
            if (maxval == item.getValue())
                System.out.println(item.getKey());


    }
}
