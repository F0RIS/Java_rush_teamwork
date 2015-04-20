package com.javarush.test.level08.lesson11.home01;

import java.util.*;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //Нап

        Iterator<Cat> iterator = cats.iterator();

        cats.remove(iterator.next());

        //cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats()
    {

        HashSet<Cat> set = new HashSet<Cat>();

        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());

        //Написать тут ваш код. step 2 - пункт 2
        return set;
    }

    public static void printCats(Set<Cat> cats)
    {
        // step 4 - пункт 4

        for (Cat cat: cats)
            System.out.println(cat.getClass().getSimpleName());

    }

    // step 1 - пункт 1

    public static class Cat{


    }
}
