package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
/*
        String name = r.readLine();
        int y,m,d;
        d = Integer.parseInt(r.readLine());
        m = Integer.parseInt(r.readLine());
        y = Integer.parseInt(r.readLine());

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);
        */

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name = in.readLine();
        int y = Integer.parseInt(in.readLine());
        int m = Integer.parseInt(in.readLine());
        int d = Integer.parseInt(in.readLine());
        System.out.print("Меня зовут " + name +"\nЯ родился "+ d + "." + m + "."+y);
    }
}
