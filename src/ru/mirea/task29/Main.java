package ru.mirea.task29;

import java.io.*;
//Сериализация — это процесс сохранения состояния объекта в последовательность байт.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        double dollar = 73.56;
        double euro = 82.89;
        CurrencyInfo info = new CurrencyInfo(dollar, euro);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Asus\\Desktop\\MIREA\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(info);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Asus\\Desktop\\MIREA\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        CurrencyInfo newInfo = (CurrencyInfo) objectInputStream.readObject();

        System.out.println(newInfo);
    }
}
