package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 30.04.15.
 */
public class RussianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 10;
    }

    String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.RUSSIA+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
