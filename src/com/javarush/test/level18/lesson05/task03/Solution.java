package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1pos = br.readLine();
        FileInputStream file1 = new FileInputStream(file1pos);
        String file2pos = br.readLine();
        String file3pos = br.readLine();
        FileOutputStream file2out = new FileOutputStream(file2pos);
        FileOutputStream file3out = new FileOutputStream(file3pos);
        int bytesize = file1.available();
        int chetnoe = file1.available()%2;
        int count = 0;
        System.out.println(chetnoe);
        if (chetnoe==1) {
            while(file1.available()>0) {
                int read = file1.read();
                if (count>bytesize/2) {
                    file3out.write(read);
                    count++;
                }
                else
                {
                    file2out.write(read);
                    count++;
                }
            }
        }
        else if (chetnoe == 0) {
            while (file1.available()>0) {
                int read = file1.read();
                if (count>=bytesize/2) {
                    file3out.write(read);
                    count++;
                }
                else {
                    file2out.write(read);
                    count++;
                }
            }
        }
        file1.close();
        file2out.close();
        file3out.close();


    }
}
