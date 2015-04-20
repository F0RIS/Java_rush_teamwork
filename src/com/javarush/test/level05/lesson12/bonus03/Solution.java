package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;

        //напишите здесь ваш код
        int N = Integer.parseInt(reader.readLine());
        if (N > 0) {
            int num;

            for (int i = 0; i < N; i++)
            {
                num = Integer.parseInt(reader.readLine());
                if (maximum < num)
                    maximum = num;
            }



            System.out.println(maximum);
        }


    }
}
