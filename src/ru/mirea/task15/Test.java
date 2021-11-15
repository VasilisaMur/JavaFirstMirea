package ru.mirea.task15;
import java.io.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Реализовать запись в файл введённой с клавиатуры информации.
        try(FileWriter writer = new FileWriter("test.txt", false))
        {
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //Реализовать вывод информации из файла на экран.
        try(FileReader reader = new FileReader("test.txt"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        //Заменить информацию в файле на информацию, введённую с клавиатуры.
        try(FileWriter writer = new FileWriter("test.txt", false))
        {
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        //Добавить в конец исходного файла текст, введённый с клавиатуры.
        try(FileWriter writer = new FileWriter("test.txt", true))
        {
            String text = sc.nextLine();
            writer.write(text);
            writer.append('\n');
            writer.flush();
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
