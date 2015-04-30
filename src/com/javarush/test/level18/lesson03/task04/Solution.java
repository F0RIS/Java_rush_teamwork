package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        HashMap<Integer, Integer> map = new  HashMap<Integer, Integer>();

//        String filename ="d:\\111.txt"; //new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream file = new FileInputStream(filename);


        while (file.available()>0){

            int temp = file.read();
            if (!map.containsKey(temp)){
                map.put(temp, 1);
            }else{
                int col = map.get(temp).intValue()+1;

                map.put(temp,col);
            }
        }

        reader.close();
        file.close();
        //найдем минимальное кол-во повторений байта
        int min_col = Integer.MAX_VALUE;//минимальное количество вхождений какого либо байта
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            if (item.getValue() < min_col) min_col = item.getValue();

        }

        System.out.println(map);
        //проходит по карте и печатет значений байтов, которые встретились max_col раз
        for (Map.Entry<Integer,Integer> item : map.entrySet()){
            if (item.getValue() == min_col)
                System.out.print(item.getKey()+" ");
        }
    }
}
