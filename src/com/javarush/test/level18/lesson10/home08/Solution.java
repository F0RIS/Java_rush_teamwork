package com.javarush.test.level18.lesson10.home08;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public  static  Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws InterruptedException
    {

        ArrayList<String> fileNames = new ArrayList<String>();

//        //преобразование знаковых байтов в инт
//        byte x = (byte) 238;
//        System.out.println((int)x);//выводит -18
//        System.out.println((int)x&255);//выводит 238
//        System.out.println(Integer.toBinaryString((int)x));
//        System.out.println(Integer.toBinaryString((int)x&255));


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)))
        {
            while (true)
            {
                String line = reader.readLine();
                if (line.equals("exit")) break;
                if (!line.isEmpty())
                    fileNames.add(line);

            }
            reader.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
//        Instant start = Instant.now();//засекаем время старта

        //создаем и запускаем потоки
        List<ReadThread> threadPool = new ArrayList<ReadThread>();
        for (String item : fileNames){
            ReadThread readThread = new ReadThread(item);
            threadPool.add(readThread);
            readThread.start();

        }

        //ождиаем выполнения ВСЕХ потоков
        for (ReadThread item: threadPool){
            item.join();
        }


//        System.out.println("time:" + Duration.between(start, Instant.now())); //смотрим сколько выполнялась программа
        System.out.println(resultMap);

/*
d:\1.txt
d:\bd2.txt
exit

d:\survarium-test 2014-12-06 19-29-21-58.png
d:\survarium-test 2014-12-06 19-51-50-00.png
exit
*/
    }

    public static class ReadThread extends Thread {
        private String filename;

        public ReadThread(String fileName) {
            //implement constructor body
            this.filename = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут


        @Override
        public void run()
        {
            try (FileInputStream file = new FileInputStream(filename))
            {

                Map<Integer, Integer> map = new HashMap<Integer, Integer>();

                byte data[];
                data = new byte[file.available()];
                file.read(data);

                file.close();

                for (byte x2 : data)
                {
                    int x = x2&255; //корректное преобразование байта в инт что бы не полуилось отрицательное значение
                    if (!map.containsKey(x))
                        map.put(x, 1);
                    else
                        map.put(x, map.get(x).intValue() + 1);

                }

                ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
                Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>()
                {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)
                    {
                        //если кол-о повторений одинаковое, сортируем по значению байта
                        if (o1.getValue() == o2.getValue())
                            return o2.getKey() - o1.getKey();

                        return o2.getValue() - o1.getValue();
                    }
                });

                System.out.println(list);
                synchronized (resultMap)
                {
                    if (!list.isEmpty())
                        resultMap.put(filename, list.get(0).getKey());
                }
            }catch (IOException e)
            {

                System.out.println("Файл: " + filename + "  не найден.");
            }
        }
    }
}
