package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код

        ArrayList<Human> family = new ArrayList<Human>();
        ArrayList<Human> kids = new ArrayList<Human>();
        ArrayList<Human> parents = new ArrayList<Human>();


        kids.add(new Human("kid1", true, 3, null));
        kids.add(new Human("kid2", true, 4, null));
        kids.add(new Human("kid3", true, 5, null));

        parents.add(new Human("Father", true, 25, kids));
        parents.add(new Human("Mother", false, 25, kids));

        family.add(new Human("дедушка1", true, 50, parents));
        family.add(new Human("дедушка2", true, 50, parents));
        family.add(new Human("бабушка1", false, 50, parents));
        family.add(new Human("бабушка2", false, 50, parents));

        family.addAll(parents);
        family.addAll(kids);

        for (Human item : family)
            System.out.println(item);

    }

    public static class Human
    {
        private String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children != null? this.children.size(): 0;
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
