package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    String name;
    int age;
    boolean man;

    public Friend(String s){
        name = s;
    }

    public Friend(String s, int _age){
        name = s;
        age = age;
    }

    public Friend(String s, int _age, Boolean _man){
        name = s;
        age = _age;
        man = _man;
    }
}