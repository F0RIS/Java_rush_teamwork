package com.javarush.test.level14.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Player and Dancer
1. Подумать, что делает программа.
2. Изменить метод haveRest так, чтобы он вызывал метод
- play, если person имеет тип Player
- dance, если person имеет тип Dancer
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;
        String key;
        while ((key = reader.readLine()) != null)//сократил код? :)
        {
            if ("player".equals(key))
            {
                person = new Player();
            } else if ("dancer".equals(key))
            {
                person = new Dancer();
            }
            haveRest(person);
        }
    }

    public static void haveRest(Person person)
    {
        //Add your code here
        //Поправил твой код
        if (person.getClass() == Player.class)
            ((Player) person).play();
        else
        if (person.getClass() == Dancer.class)
            ((Dancer)person).dance();
    }

    interface Person
    {
    }

    static class Player implements Person
    {
        void play()
        {
            System.out.println("playing");
        }
    }

    static class Dancer implements Person
    {
        void dance()
        {
            System.out.println("dancing");
        }
    }
}
