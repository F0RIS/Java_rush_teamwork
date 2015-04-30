package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел. (вывети те байты которые встретились чаще всего и кол-во их вхождений одинаково)
Закрыть поток ввода-вывода
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();

//        String filename ="d:\\111.txt"; //new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream file = new FileInputStream(filename);

        int max_col = 0;//максимальное количество вхождений какого либо байта
        while (file.available()>0){

            int temp = file.read();
            if (!map.containsKey(temp)){
                map.put(temp, 1);

            }else{
                int col = map.get(temp).intValue()+1;
                if (col > max_col) max_col = col;
                map.put(temp,col);
            }
        }

        reader.close();
        file.close();

        //проходит по карте и печатет значений байтов, которые встретились max_col раз
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            if (item.getValue() == max_col)
                System.out.print(item.getKey()+" ");
        }

    }
}
