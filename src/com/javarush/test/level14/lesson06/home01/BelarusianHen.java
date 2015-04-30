package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 30.04.15.
 */
public class BelarusianHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 45;
    }

    String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.BELARUS+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
