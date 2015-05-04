package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        if (args.length < 1) return;

        FileInputStream file = new FileInputStream(args[0]);

        int col = 0;
        int size = file.available();

        while(file.available() > 0){
            if (' ' == ((char)file.read()))
            {
                col++;
            }
        }

//        System.out.println(col);
//        System.out.println(size);

        System.out.println(String.format("%.2f", ((float)col/size*100.0) ));


    }
}
