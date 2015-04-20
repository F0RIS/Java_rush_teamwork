package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их
так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human,
то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human ded1 = new Human("Petya", true, 55);
        Human ded2 = new Human("Kolya", true, 60);
        Human bab1 = new Human("Masha", false, 55);
        Human bab2 = new Human("Rita", false, 55);
        Human fat1 = new Human("Sasha", true, 30, ded1, bab1);
        Human mam1 = new Human("Olya", false, 35, ded2, bab2);
        Human kid1 = new Human("Anna", false, 10, fat1, mam1);
        Human kid2 = new Human("Nadja", false, 12, fat1, mam1);
        Human kid3 = new Human("Vasja", false, 13, fat1, mam1);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(fat1);
        System.out.println(mam1);
        System.out.println(kid1);
        System.out.println(kid2);
        System.out.println(kid3);

    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        Boolean sex;
        int age;
        String father;
        String mother;


        public Human(String name, Boolean sex, int age ){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public Human(String name, Boolean sex, int age, Human father, Human mother ){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father.name;
            this.mother = mother.name;
        }//Написать тут ваш код


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father;

            if (this.mother != null)
                text += ", мать: " + this.mother;

            return text;
        }
    }

}
