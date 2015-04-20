package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
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

    public void initialize(String s){
        name = s;
    }

    public void initialize(String s, int _age){
        name = s;
        age = age;
    }

    public void initialize(String s, int _age, Boolean _man){
        name = s;
        age = _age;
        man = _man;
    }


}
