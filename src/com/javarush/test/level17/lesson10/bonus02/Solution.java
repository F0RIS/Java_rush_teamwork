package com.javarush.test.level17.lesson10.bonus02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD 2
CrUD Batch - multiple Creation, Updates, Deletion
!!!РЕКОМЕНДУЕТСЯ выполнить level17.lesson10.bonus01 перед этой задачей!!!

Программа запускается с одним из следующих наборов параметров:
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет всех людей с заданными параметрами в конец allPeople, выводит id (index) на экран в соответствующем порядке
-u  - обновляет соответствующие данные людей с заданными id
-d  - производит логическое удаление всех людей с заданными id
-i  - выводит на экран информацию о всех людях с заданными id: name sex bd

id соответствует индексу в списке
Формат вывода даты рождения 15-Apr-1990
Все люди должны храниться в allPeople
Порядок вывода данных соответствует вводу данных
Обеспечить корректную работу с данными для множества нитей (чтоб не было затирания данных)
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();
    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        if (args[0].equals("-c"))
            synchronized (Solution.class)
            {
                createPerson(args);
            }
        else
        if (args[0].equals("-u"))
            synchronized (Solution.class)
            {
                updatePerson(args);
            }
        else
        if (args[0].equals("-d"))
            synchronized (Solution.class)
            {
                deletePerson(args);
            }
        else
        if (args[0].equals("-i"))
            synchronized (Solution.class)
            {
                showPerson(args);
            }
    }

    private static void createPerson(String[] args)
    {
        String name;
        String sex;
        String bd;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;
        for (int i = 1; i < args.length; i+=3)
        {
            name = args[i];
            sex = args[i+1];
            bd = args[i+2];
            try
            {
                if (sex.equals("м"))
                    person = Person.createMale(name,simpleDateFormat.parse(bd));
                else
                if (sex.equals("ж"))
                    person = Person.createFemale(name, simpleDateFormat.parse(bd));
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
            //showPerson(new String[]{"", String.valueOf(allPeople.indexOf(person))});

        }


    }

    private static void updatePerson(String[] args)
    {
        int id;
        String name;
        String sex;
        String bd;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;
        for (int i = 1; i < args.length; i += 4)
        {
            id = Integer.parseInt(args[i]);
            name = args[i + 1];
            sex = args[i + 2];
            bd = args[i + 3];

            person = allPeople.get(id);

            person.setName(name);
            person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
            try
            {
                 person.setBirthDay(simpleDateFormat.parse(bd));

            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }

            //showPerson(new String[]{"", String.valueOf(allPeople.indexOf(person))});
        }
    }

    private static void deletePerson(String[] ids)
    {

        for (int i = 1; i < ids.length; i++)
        {
            Person person = allPeople.get(Integer.parseInt(ids[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDay(null);
        }
    }

    private static void showPerson(String[] arg)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);

        for (int i = 1; i < arg.length; i++)
        {
            Person person = allPeople.get(Integer.parseInt(arg[i]));
            System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE?"м":"ж") + " " + simpleDateFormat.format(person.getBirthDay())  );
        }
    }

}
