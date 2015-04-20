package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код


        ArrayList<String> sList = new ArrayList<String>();
        Collections.addAll(sList, "мама", "мыла", "раму");

        for (int i = 1; i < 6; i+=2)
        {
            sList.add(i,"именно");
        }

        for (String s:sList)
            System.out.println(s);
    }
}
