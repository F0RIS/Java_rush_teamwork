package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/

import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //Напишите тут ваш код
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Я буду зарабатывать $"+n+" в час");
    }
}