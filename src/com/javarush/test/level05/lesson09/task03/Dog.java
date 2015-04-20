package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    //Напишите тут ваш код
    String name;
    int height, color;

    public Dog(String s){
        name = s;
    }

    public Dog(String s, int _height){
        name = s;
        height = _height;
    }

    public Dog(String s, int _height, int _color){
        name = s;
        height = _height;
        color = _color;
    }
}
