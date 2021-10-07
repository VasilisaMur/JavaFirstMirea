package ru.mirea.task5;

public class TestFurniture {
    public static void main(String[] args) {
        Sofa sofa = new Sofa("leather", 130, 15);
        System.out.println(sofa);
        Stool stool = new Stool("wooden",120,20);
        System.out.println(stool);
    }
}
