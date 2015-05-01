package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(23.3,"asd");
        labels.put(23.5,"a5sd");
        labels.put(23.2,"a56sd");
        labels.put(223.8,"a563sd");
        labels.put(2253.8,"a256sd");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
