package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        // Создай по два объекта каждого класса тут
        Man man = new Man("man","donetsk",5);
        Woman wom = new Woman("Woman","donetsk",5);

        System.out.println(man);
        System.out.println(wom);


        // Выведи их на экран тут
    }

    // Напиши тут свои классы
    public static class Man{
        String name, address;
        int age;

        public Man(String name, String addr, int age){
            this.name = name;
            this.address = addr;
            this.age = age;

        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        String name, address;
        int age;

        public Woman(String name, String addr, int age){
            this.name = name;
            this.address = addr;
            this.age = age;

        }

        public String toString() {
            return name + " " + age + " " + address;
        }
    }
}
