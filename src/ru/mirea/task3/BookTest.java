package ru.mirea.task3;

public class BookTest {
    public static void main(String[] args) {
        Book b = new Book("Bulgakov","M and M",1900);
        System.out.println(b.getAuthor());
        b.setName("Master & M");
        System.out.println(b.getName());
    }
}
