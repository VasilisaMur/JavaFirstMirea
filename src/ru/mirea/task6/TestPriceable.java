package ru.mirea.task6;

public class TestPriceable {
    public static void main(String[] args) {
        Milk milk = new Milk();
        System.out.println(milk.getPrice());
        Book book = new Book();
        System.out.println(book.getPrice());
    }
}
