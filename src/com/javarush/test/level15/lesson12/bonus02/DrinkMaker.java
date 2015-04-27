package com.javarush.test.level15.lesson12.bonus02;

/**
 * Created by F0RIS on 27.04.2015.
 */
public abstract class DrinkMaker
{
    abstract void getRightCup();
    abstract void putIngredient();
    abstract void pour();

    void makeDrink(){
        getRightCup();
        putIngredient();
        pour();

    }
}
