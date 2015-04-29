package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-с  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
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
            createPerson(args);
        else
        if (args[0].equals("-u"))
            updatePerson(args);
        else
        if (args[0].equals("-d"))
            deletePerson(Integer.parseInt(args[1]));
        else
        if (args[0].equals("-i"))
            showPerson(Integer.parseInt(args[1]));


        //showPerson(allPeople.size()-1);
    }



    private static void createPerson(String[] args)
    {
        if (args.length < 4) return;
        String name;
        String sex;
        String bd;
        if (args.length == 5){
            name = args[1] +" " +args[2];
            sex = args[3];
            bd = args[4];
        }else{
            name = args[1];
            sex = args[2];
            bd = args[3];
        }



        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Person person = null;
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

    }

    private static void updatePerson(String[] args)
    {
        if (args.length < 5) return;
        int id = Integer.parseInt(args[1]);
        String name;
        String sex;
        String bd;

        if (args.length == 6){
            name = args[2] +" " +args[3];
            sex = args[4];
            bd = args[5];
        }else{
            name = args[2];
            sex = args[3];
            bd = args[4];
        }

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        Person person = allPeople.get(id);

        try
        {
            person.setName(name);
            person.setSex(sex.equals("м") ? Sex.MALE:Sex.FEMALE);
            person.setBirthDay(simpleDateFormat.parse(bd));
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }


    }

    private static void deletePerson(int id)
    {
        //System.out.print("Удален: ");
        //showPerson(i);
        //allPeople.remove(i);

        Person person = allPeople.get(id);
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);



    }

    private static void showPerson(int arg)
    {
        Person person = allPeople.get(arg);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-y", Locale.ENGLISH);
        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE?"м":"ж") + " " + simpleDateFormat.format(person.getBirthDay())  );
    }
}
