package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    static void swap(int x1, int x2){
        int temp;


    }

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a[] = new int [3];

        for (int i = 0; i < 3; i++)
        {
            a[i] = Integer.parseInt(r.readLine());
        }

        int temp;
        for (int i = 0; i < 3; i++)
        {
            for (int j = 1; j < 3; j++)
                if (a[j] > a[j - 1])
                {

                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }


        }

        for (int i = 0; i < 3; i++)
            System.out.println(a[i]);
    }
}
