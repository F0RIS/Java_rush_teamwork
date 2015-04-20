package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x[] = new int[20];

        for (int i = 0; i < 20; i++)
        {
            x[i] = Integer.parseInt(reader.readLine());
        }

        int x2[] = new int[10];
        int x3[] = new int[10];

        for (int i = 0; i < 20; i++)
        {
            if (i < 10)
                x2[i] = x[i];
            else
                x3[i-10] = x[i];
        }



        for (int i = 0; i < 10; i++)
        {
            System.out.println(x3[i]);
        }
    }
}
