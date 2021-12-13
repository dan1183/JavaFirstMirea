package ru.mirea.task29;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CurrencyInfo a = new CurrencyInfo();

        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(a);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("a.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo a2 = (CurrencyInfo) objectInputStream.readObject();
        objectInputStream.close();
    }
}
