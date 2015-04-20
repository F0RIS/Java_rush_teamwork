package com.javarush.test.level12.lesson12.home02;

/* Метод setName в классе Cat
Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");

        System.out.println(pet.getName());
    }

    public static class Pet
    {
        protected String name;

        public Pet()
        {
        }

        public String getName()
        {
            return name;
        }

        public void setName(String name)
        {
            this.name = "Я - кот";
        }

    }

    public static class Cat extends Pet
    {


        @Override
        public void setName(String name)
        {
            this.name = "Я - кот";
        }
    }
}
