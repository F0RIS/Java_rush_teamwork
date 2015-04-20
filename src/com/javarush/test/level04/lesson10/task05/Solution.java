package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        int i1 = 1;
        int i2 = 1;

        while (i2 <= 10)
        {
            while (i1 <= 10)
            {
                System.out.print(i1 * i2+" ");
                i1++;
            }
            i2++;
            i1 = 1;
            System.out.println();
        }
    }
}
