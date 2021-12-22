package ru.mirea.task18;

import java.util.Scanner;

public class Test1 {
    private String name;
    private int INN;

    Test1() {
        Scanner sc = new Scanner(System.in);
        this.name = sc.next();

        try {
            this.INN = sc.nextInt();
        } catch (Exception NumberFormatException) {
            System.out.println("Неверный ИНН!");
        }

    }

    public static void main(String[] args) {
        new Test1();
    }
}
