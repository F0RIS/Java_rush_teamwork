package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    int centerX, centerY, radius, width, color;

    public Circle(int centerX, int centerY){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = 1;
    }

    public Circle(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.color = color;
    }
}
