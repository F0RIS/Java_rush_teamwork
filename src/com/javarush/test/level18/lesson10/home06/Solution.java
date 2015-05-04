package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки

Пример вывода:
, 19
- 7
f 361
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        if (args.length < 1) return;

        FileInputStream file = new FileInputStream(args[0]);


        Map<Character,Integer> map = new HashMap<Character, Integer>();

        TreeMap<Character, Integer> treeMap = new TreeMap<Character, Integer>();

        while(file.available() > 0){

            char ch = (char)file.read();
            if (!treeMap.containsKey(ch))
                treeMap.put(ch,1);
            else
                treeMap.put(ch, treeMap.get(ch).intValue()+1);
        }

        for (Map.Entry<Character, Integer> item : treeMap.entrySet()){
            System.out.println(item.getKey()+" "+item.getValue());
        }

    }
}


