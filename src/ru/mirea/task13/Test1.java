package ru.mirea.task13;

public class Test1 {
    public static void main(String[] args)
    {
        java.util.ArrayList<String> cats=new java.util.ArrayList<String>();
        cats.add("Кот1");
        cats.add("Кот2");
        cats.add("Кот3");
        cats.add(1, "НовыйКот");
        cats.add(cats.size()-1,"НовыйКот2");
        System.out.printf("В списке %d элементов \n", cats.size());
        for(String cat : cats){

            System.out.println(cat);
        }
        if(cats.contains("НовыйКот")){

            System.out.println("содержится НовыйКот");
        }
        System.out.println("Удалили первый элемент");
        cats.remove(0);
        for(String cat : cats){

            System.out.println(cat);
        }
    }
}
