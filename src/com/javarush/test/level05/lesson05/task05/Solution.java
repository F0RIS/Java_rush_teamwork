package com.javarush.test.level05.lesson05.task05;

/* Провести три боя  попарно между котами
Создать три кота используя класс Cat.
Провести три боя попарно между котами.
Класс Cat создавать не надо. Для боя использовать метод boolean fight(Cat anotherCat).
Результат каждого боя вывести на экран.
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Cat catRudik = new Cat("Rudik", 5, 4, 8);
        Cat catMurzik = new Cat("Murzik", 2, 5, 7);
        Cat catBarsik = new Cat("Barsik", 3, 3, 9);
        String winner = "";
        winner = catRudik.fight(catMurzik) ? "Rudik победил Murzik" : "Murzik победил Rudik";
        System.out.println(winner);
        winner = catRudik.fight(catBarsik) ? "Rudik победил Barsik" : "Barsik победил Rudik";
        System.out.println(winner);
        winner = catMurzik.fight(catBarsik) ? "Murzik победил Barsik" : "Barsik победил Murzik";
        System.out.println(winner);


    }

    public static class Cat {

        public static int count = 0;
        public static int fightCount = 0;

        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            fightCount++;

            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; //эквивалентно return score > 2 ? true : false;
        }
    }
}
