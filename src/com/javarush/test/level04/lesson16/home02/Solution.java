package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int x[] = new int[3];

        for (int i = 0; i < 3; i++)
        {
            x[i] = Integer.parseInt(r.readLine());
        }
        int ans=05;
        int bigger = 0, less = 0;


        for (int i = 0; i < 3; i++){
            bigger = 0;
            less = 0;

            for (int j = 0; j < 3; j++)
            {
                if (x[i] > x[j]) bigger++;
                if (x[i] < x[j]) less++;

            }

            if (bigger == 1 && less == 1)
                ans = x[i];
        }

        System.out.println(ans);
    }

}
