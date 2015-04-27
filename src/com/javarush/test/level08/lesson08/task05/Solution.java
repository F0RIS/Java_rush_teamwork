package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{

    //TODO тест
    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String , String> map = new HashMap<String, String>();
        map.put("1", "Иван");
        map.put("2", "Иван");
        map.put("3", "Ваня");
        map.put("4", "Денис");
        map.put("5", "Александр");
        map.put("6", "Настя");
        map.put("7", "Жека");
        map.put("8", "Серега");
        map.put("9", "плащ");
        map.put("10", "плащ");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {

        /*
        //Напишите тут ваш код
        HashMap<String, String> result = new HashMap<String, String>();

        for (Map.Entry<String, String> pair: map.entrySet())
        {
            if (!result.containsValue(pair.getValue()))
                result.put(pair.getKey(), pair.getValue());
            else
            {
                removeItemFromMapByValue(result, pair.getValue());
                //System.out.println("remove: " + pair.getValue());
            }
        }


        System.out.println(result);
        map.clear();
        map.putAll(result);
        */

        //Напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> p: copy.entrySet()) {
                if (pair.getValue().equals(p.getValue())){
                    count++;
                    if(count > 1){
                        map.remove(pair.getKey());
                    }
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();


        removeTheFirstNameDuplicates(map);

        System.out.println(map);
    }
}
