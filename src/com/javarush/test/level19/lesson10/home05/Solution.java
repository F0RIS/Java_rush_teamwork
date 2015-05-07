package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader file1 = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF8"));
        BufferedWriter file2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]),"UTF8"));



        String line;
        while((line = file1.readLine()) != null){

            Pattern p = Pattern.compile(".*[0-9].*");//не цифровой символ 0 и более, цифра, опять не цифровой ноль и более


            String words[] = line.split(" ");

            for (int i = 0; i < words.length; i++)
            {
                Matcher m = p.matcher(words[i]);
                if (m.matches())
                {
                    System.out.println(words[i]);
                    file2.write(words[i]+" ");
                }
            }

        }

        file1.close();
        file2.close();


    }
}
