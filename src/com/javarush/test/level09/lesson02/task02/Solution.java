package com.javarush.test.level09.lesson02.task02;

/* И снова StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью StackTrace.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {


        method1();
        //System.out.println(method3());
    }

    public static String method1()
    {
        method2();
        //Напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        return elements[2].getMethodName();

    }

    public static String method2()
    {
        method3();
        //Напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        return elements[2].getMethodName();

    }

    public static String method3()
    {
        method4();
        //Напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        return elements[2].getMethodName();


    }

    public static String method4()
    {
        method5();
        //Напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        return elements[2].getMethodName();


    }

    public static String method5()
    {

        StackTraceElement[] elements = Thread.currentThread().getStackTrace();

        return elements[2].getMethodName();

    }
}
