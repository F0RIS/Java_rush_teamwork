package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String , String> map = new HashMap<String, String>();
        map.put("Иванов", "Леша");
        map.put("Петров", "Иван");
        map.put("Остапчук", "Ваня");
        map.put("Фролов", "Денис");
        map.put("Домбровский", "Александр");
        map.put("Докалина", "Настя");
        map.put("Заровынятных", "Жека");
        map.put("Ермак", "Серега");
        map.put("Белый", "плащ");
        map.put("Черный", "Иван");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //Напишите тут ваш код
        int kol = 0;
        for (Map.Entry<String, String> item : map.entrySet())
            if (item.getValue().equals(name))
                kol++;


        return kol;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        //Напишите тут ваш код

        int kol = 0;
        for (Map.Entry<String, String> item : map.entrySet())
            if (item.getKey().equals(familiya))
                kol++;


        return kol;

    }
}
