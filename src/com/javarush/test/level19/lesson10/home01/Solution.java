package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {


    static class Record{

        String name;
        Double value;

        public Record(String name, Double value)
        {
            this.name = name;
            this.value = value;
        }

        @Override
        public String toString()
        {
            return name+" "+ Double.toString(value);
        }
    }

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


        for (Map.Entry<String, Double> item : map.entrySet())
            System.out.println(item.getKey()+" "+item.getValue());

//        System.out.println(map);
    }
}
