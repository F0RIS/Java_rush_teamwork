package com.javarush.test.level05.lesson05.task03;

/* Геттеры и сеттеры для класса Dog
Создать class Dog. У собаки должна быть кличка String name и возраст int age.
Создайте геттеры и сеттеры для всех переменных класса Dog.
*/

public class Dog {
    //добавьте переменные класса тут
    String name;
    int age;

    public void setName(String s){

        name = s;
    }

    public String getName(){

        return name;
    }

    public void setAge(int age){

        this.age = age;
    }

    public int getAge(){

        return age;
    }
    //добавьте геттеры и сеттеры тут
}
