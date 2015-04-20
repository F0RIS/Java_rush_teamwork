package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int minnum = Integer.MAX_VALUE;
        int num;

        for (int i = 0; i < 5; i++)
        {
            num = Integer.parseInt(reader.readLine());
            if (num < minnum)
                minnum = num;
        }

        //int minimum = min(a, b);

        System.out.println("Minimum = " + minnum);
    }


    public static int min(int a, int b)
    {
        return a < b ? a : b;
    }

}
