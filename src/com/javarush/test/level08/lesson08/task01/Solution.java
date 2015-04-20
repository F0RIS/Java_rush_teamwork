package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код

        HashSet<String> set = new HashSet<String>();

        set.add("Лиса");
        set.add("Листва");
        set.add("Локоть");
        set.add("Лукавый");
        set.add("Лакомый");
        set.add("Лак");
        set.add("Люк");
        set.add("Ломбард");
        set.add("Лапласс");
        set.add("Лектор");
        set.add("Лифт");
        set.add("Луч");
        set.add("Лоза");
        set.add("Лресло");
        set.add("Ллумба");
        set.add("Лабрадор");
        set.add("Ллишком");
        set.add("Ллоский");
        set.add("Лошлый");
        set.add("ЛУхлый");

        return set;
    }
}
