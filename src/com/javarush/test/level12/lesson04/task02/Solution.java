package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {

        print((int)23);
        print((Integer)23);


    }

    //Напишите тут ваши методы
    static void print(int x){};

    static void print (Integer x){};
}
