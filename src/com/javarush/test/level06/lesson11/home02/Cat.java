package com.javarush.test.level06.lesson11.home02;

import java.util.ArrayList;

/* Статические коты
1. В классе Cat добавь public статическую переменную cats (ArrayList<Cat>).
2. Пусть при каждом создании кота (нового объекта Cat) в переменную cats добавляется этот новый кот. Создать 10 объектов Cat.
3. Метод printCats должен выводить всех котов на экран. Нужно использовать переменную cats.
*/

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<Cat>(10);;

    public Cat() {
        cats.add(this);
    }
    //add your code here - добавь свой код тут

    public static void main(String[] args) {
        //Create 10 Cat-s here - создай 10 котов тут

        for (int i = 0; i < 10; i++)
        {
            new Cat();
        }

        printCats();
    }

    public static void printCats() {
        //add your step 3 code here - добавь свой код для пункта 3 тут
        for (int i = 0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i).toString());
        }

    }
}
