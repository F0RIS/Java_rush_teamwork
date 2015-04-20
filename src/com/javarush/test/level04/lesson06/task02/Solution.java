package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int [4];

        int max=-100;
        for (int i = 0; i < 4; i++)
        {
            a[i] = Integer.parseInt(r.readLine());
            if (max < a[i]) max = a[i];
        }

        System.out.println(max);
    }
}
