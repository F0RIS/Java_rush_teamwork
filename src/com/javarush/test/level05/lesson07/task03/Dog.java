package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    String name;
    int height, color;

    public void initialize(String s){
        name = s;
    }

    public void initialize(String s, int _height){
        name = s;
        height = _height;
    }

    public void initialize(String s, int _height, int _color){
        name = s;
        height = _height;
        color = _color;
    }
}
