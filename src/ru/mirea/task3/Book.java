package ru.mirea.task3;

public class Book {
    private String author;
    private String name;
    private int year;

    public Book(String a, String n, int y) {
        this.author = a;
        this.name = n;
        this.year = y;
    }

    public void setAuthor(String n) {
        this.author = n;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }
}
