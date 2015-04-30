package com.javarush.test.level18.lesson08.task03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* AmigoOutputStream
1 Измените класс AmigoOutputStream так, чтобы он стал Wrapper-ом для класса FileOutputStream
2 При вызове метода close() должны выполняться следующая последовательность действий:
2.1 вызвать метод flush()
2.2 дописать следующий текст [JavaRush © 2012-2013 All rights reserved.], используйте метод getBytes()
2.3 закрыть поток методом close()
*/

public class AmigoOutputStream
{
    public static String fileName = "d:\\333.txt";
    private FileOutputStream fos;

    public AmigoOutputStream(FileOutputStream fileOutputStream) throws IOException
    {
        fos = fileOutputStream;
    }

    public static void main(String[] args) throws IOException
    {
        AmigoOutputStream amigoOutputStream = new AmigoOutputStream(new FileOutputStream(fileName));
        amigoOutputStream.write("Hello wrapper!!) \n".getBytes());
        amigoOutputStream.close();

    }


    public void write(int b) throws IOException
    {
        fos.write(b);
    }


    public void write(byte[] b) throws IOException
    {
        fos.write(b);
    }


    public void write(byte[] b, int off, int len) throws IOException
    {
        fos.write(b, off, len);
    }


    public void close() throws IOException
    {
        fos.flush();
        String s = "JavaRush © 2012-2013 All rights reserved.";
        fos.write(s.getBytes());
        fos.close();
    }


    public FileChannel getChannel()
    {
        return fos.getChannel();
    }


    public void flush() throws IOException
    {
        fos.flush();
    }
}
