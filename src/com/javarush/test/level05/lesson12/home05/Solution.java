package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import sun.rmi.server.InactiveGroupException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int sum = 0;
        String s;

        for (int i = 0; i < 5; i++)
        {
            s = reader.readLine();
            if (s.equals("сумма"))
                break;
            else
                sum += Integer.parseInt(s);

        }

        System.out.println(sum);
    }
}
