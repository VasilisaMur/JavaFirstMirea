package ru.mirea.task3;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(4.5, "red");
        System.out.println(c.getRadius());
        c.setRadius(2.5);
        System.out.println(c.getArea());
    }
}
