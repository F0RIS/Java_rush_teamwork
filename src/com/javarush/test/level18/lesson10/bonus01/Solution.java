package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import com.javarush.test.level06.lesson08.task05.StringHelper;

import java.io.*;

public class Solution {

    static String inFile;
    static String outFile;

    public static void main(String[] args) throws IOException
    {

        if (args.length < 3) return;

        inFile = args[1];
        outFile = args[2];


        if (args[0].equals("-e")){
            crypt();
        }
        else
        if (args[0].equals("-d"))
            decrypt();

    }


    private static void crypt() throws IOException
    {
        FileInputStream in = new FileInputStream(inFile);
        FileOutputStream out = new FileOutputStream(outFile);


        while (in.available() > 0){
            int temp = in.read();
            temp ^= 77;
            out.write(temp);

        }


    }

    private static void decrypt() throws IOException
    {
        FileInputStream in = new FileInputStream(inFile);
        FileOutputStream out = new FileOutputStream(outFile);


        while (in.available() > 0){
            int temp = in.read();
            temp ^= 77;
            out.write(temp);

        }

    }

}
