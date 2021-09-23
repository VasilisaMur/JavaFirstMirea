package ru.mirea.task2;

public class TestBook {
    public TestBook() {
    }

    public static void main(String[] args) {
        Book book1 = new Book("Andrew", 1993);
        new Book("Irina");
        Book book3 = new Book();
        book3.setYear(1500);
        System.out.println(book3);
        book1.Age();
        book3.Age();
    }
}
