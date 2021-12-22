package ru.mirea.task12;

import java.util.Random;

public class Student {
    String name;
    int gpa;

    public Student(String name) {
        this.name = name;
        Random random = new Random();
        this.gpa = random.nextInt(100);
    }

    public Student(String name, int gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGpa() {
        return gpa;
    }

    public void setGpa(int gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return this.name + " - " + this.gpa;
    }
}