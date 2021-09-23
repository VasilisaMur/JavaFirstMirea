package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape("red",true);
        s1.setColor("blue");
        System.out.println(s1.isFilled());
        System.out.println(s1);
    }
}
