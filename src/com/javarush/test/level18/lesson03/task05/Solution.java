package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.TreeSet;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {


        TreeSet<Integer> set = new TreeSet<Integer>();

//        String filename ="d:\\1.png"; //new BufferedReader(new InputStreamReader(System.in)).readLine();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream file = new FileInputStream(filename);

        while (file.available()>0){

            set.add(file.read());

        }
        reader.close();
        file.close();



        for (int x:set){
            System.out.print(x + " ");
        }



    }
}
