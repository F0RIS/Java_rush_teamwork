package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a,b,res;

        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());


        while(a > 0 && b > 0)
        {

            if (a > b)
                a %= b;

            else
                b %= a;
        }
        res = a + b;


        System.out.println(res);

    }
}
