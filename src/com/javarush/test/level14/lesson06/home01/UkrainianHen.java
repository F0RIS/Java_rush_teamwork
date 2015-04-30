package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 30.04.15.
 */
public class UkrainianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 30;
    }

    String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.UKRAINE+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
