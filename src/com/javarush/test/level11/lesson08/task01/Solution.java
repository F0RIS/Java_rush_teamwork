package com.javarush.test.level11.lesson08.task01;

/* Все скрыто
Скрыть все внутренние переменные класса Cat.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        System.out.println("Имя: " + cat.name + " Возраст: "+ cat.age + " Вес: " + cat.weight +"кг");

    }

    public static class Cat
    {
        private String name;
        private int age;
        private int weight;

        public Cat()
        {
            age = 1;
            weight = 1;
            name = "Нет имени";
        }

        public Cat(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }


    }
}
