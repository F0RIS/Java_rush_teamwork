package com.javarush.test.level18.lesson10.bonus03;

/* Прайсы 2
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается с одним из следующих наборов параметров:
-u id productName price quantity
-d id
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-u  - обновляет данные товара с заданным id
-d  - производит физическое удаление товара с заданным id (все данные, которые относятся к переданному id)

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class Solution {

    static class Product{
        int id;
        String productName;
        float price;
        int quantity;

        public Product(int id, String productName, float price, int quantity)
        {
            this.id = id;
            this.productName = productName;
            this.price = price;
            this.quantity = quantity;
        }


        @Override
        public String toString()
        {
            return String.format(Locale.ENGLISH, "%-8d%-30.30s%-8.2f%-4d", id, productName, price, quantity);
        }
    }

    static class BD{

        private String filename;
        private ArrayList<Product> list = new ArrayList<Product>();
        private int maxid;

        public BD(String filename) throws IOException
        {
            this.filename = filename;
            readFile();
        }

        void readFile() throws IOException
        {
            BufferedReader file = new BufferedReader(new FileReader(filename));
            String line;
            int id;
            String productname;
            Float price;
            int quantity;

            while ((line = file.readLine())!= null){

                if (line.isEmpty())
                    continue;

                id = Integer.parseInt(line.substring(0, 8).trim());
                productname = line.substring(8, 38).trim();
                price = Float.parseFloat(line.substring(38, 46).trim());
                quantity = Integer.parseInt(line.substring(46, 50).trim());
                list.add(new Product(id,productname,price,quantity));
                if (id > maxid) maxid = id;
            }

//            for (Product item : list)
//                System.out.println(item);

            file.close();
        }

        void updateProduct(String[] args) throws IOException
        {

            //собираем имя
            StringBuilder name = new StringBuilder();
            for (int i = 2; i < args.length - 2; i++)
            {
                name.append(args[i]+" ");
            }

            String price = args[args.length - 2];
            price = price.replace(",",".");
            int id = Integer.parseInt(args[1]);

            //ищем нужный элемент
            Product pr = null;
            for (Product item : list)
                if (item.id == id){
                    pr = item;
                    break;
                }
            //обновляем данные
            pr.productName = name.toString();
            pr.quantity = Integer.parseInt(args[args.length - 1]);
            pr.price = Float.parseFloat(price);


            FileOutputStream f = new FileOutputStream(filename);
            for (Product item : list)
                f.write((item.toString() + "\n").getBytes());

            f.close();
        }


        public void deleteProduct(int di) throws IOException
        {

            for (Product item : list)
                if (item.id == di){
                    list.remove(item);
                    break;
                }


            FileOutputStream f = new FileOutputStream(filename);
            for (Product item : list)
                f.write((item.toString() + "\n").getBytes());

            f.close();
        }
    }


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


//        BD bd = new BD("d:\\bd2.txt");
        BD bd = new BD(reader.readLine());

        if (args.length < 1) return;
        if (args[0].equals("-u") && args.length >= 4)
            bd.updateProduct(args);

        if (args[0].equals("-d") && args.length == 2)
            bd.deleteProduct(Integer.parseInt(args[1]));


    }
}

