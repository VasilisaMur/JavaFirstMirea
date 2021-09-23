package ru.mirea.task2;

public class Book {
    private String author;
    private int year;

    public Book(String name, int y) {
        this.author = name;
        this.year = y;
    }

    public Book(String name) {
        this.author = name;
        this.year = 0;
    }

    public Book() {
        this.author = "No information";
        this.year = 0;
    }

    public void setAuthor(String n) {
        this.author = n;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return "author " + this.author + ", year " + this.year;
    }

    public void Age() {
        System.out.println("age is " + (2021 - this.year));
    }
}
