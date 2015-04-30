package com.javarush.test.level17.lesson10.home02;

/* Comparable
Реализуйте интерфейс Comparable<Beach> в классе Beach, который будет использоваться нитями.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Beach implements Comparable<Beach> {
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public synchronized int compareTo(Beach o)
    {


        float b1 = getQuality()*200 - getDistance();
        float b2 = o.getQuality()*200 - o.getDistance();



        if ((b1 == b2)  && (name.equals(o.getName()))) return 0;

        return (int) (b2-b1);

    }

    public static void main(String[] args)
    {

        ArrayList<Beach> list = new ArrayList<Beach>();

        list.add(new Beach("beach1", 100.6f, 7));
        list.add(new Beach("beach2", 50.6f, 5));
        list.add(new Beach("beach3", 200.6f, 7));
        list.add(new Beach("beach4", 300.6f, 7));

        Collections.sort(list);

        for (Beach x :list)
            System.out.println(x.getName() + " " + x.getDistance() + " " + x.getQuality());

    }

}
