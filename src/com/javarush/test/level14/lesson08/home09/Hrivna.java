package com.javarush.test.level14.lesson08.home09;

/**
 * Created by user on 12.05.15.
 */
public class Hrivna extends Money
{

    public Hrivna(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "Hrivna";
    }
}
