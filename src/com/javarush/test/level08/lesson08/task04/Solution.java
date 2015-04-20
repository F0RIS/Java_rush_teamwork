package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("lol", new Date("JUNE 1 1900"));
        map.put("lool", new Date("JUNE 1 1900"));
        map.put("lolo", new Date("JUNE 1 1900"));
        map.put("looll", new Date("JUNE 1 1900"));
        map.put("lolol", new Date("JUNE 1 1900"));
        map.put("lolololo", new Date("JUNE 1 1900"));
        map.put("olo", new Date("JUNE 1 1900"));
        map.put("olol", new Date("JUNE 1 1900"));
        map.put("trololo", new Date("JUNE 1 1900"));
        map.put("o", new Date("January 1 1900"));


        //Напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //Напишите тут ваш код

        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Map.Entry<String, Date> para = iterator.next();
            if (para.getValue().getMonth() > 4 && para.getValue().getMonth() < 8)
                iterator.remove();
        }

    }
}
