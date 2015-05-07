package com.javarush.test.level19.lesson10.home03;

import java.io.*;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException
    {


        BufferedReader file = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF8"));

        String line;

        TreeMap<String, Double> map = new TreeMap<>();
        String s[];
        while ((line = file.readLine()) != null){

            if (!line.isEmpty()){
                s = line.split(" ");

                                                                                                    //-1 т.к. календарь нумерует месяца с 0
                Calendar date = new GregorianCalendar(Integer.parseInt(s[s.length-1]),Integer.parseInt(s[s.length-2])-1, Integer.parseInt(s[s.length-3]));

                StringBuffer sb = new StringBuffer();
                for (int i = 0; i < s.length - 3; i++)
                {
                    if (i != s.length - 4)
                        sb.append(s[i]+" ");
                    else
                        sb.append(s[i]);
                }
                String name = new String(sb.toString());

                PEOPLE.add(new Person(sb.toString(), date.getTime()));

            }



        }

    }

}
