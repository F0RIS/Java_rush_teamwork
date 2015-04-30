package com.javarush.test.level14.lesson06.home01;

/**
 * Created by User on 30.04.15.
 */
public class MoldovanHen extends Hen
{
    @Override
    int getCountOfEggsPerMonth()
    {
        return 40;
    }

    String getDescription() {

        return super.getDescription() + " Моя страна - " + Country.MOLDOVA+ ". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
