package ru.mirea.task2;

public class TestBall {
    public TestBall() {
    }

    public static void main(String[] args) {
        Ball b1 = new Ball("red", 10);
        Ball b2 = new Ball("blue");
        Ball b3 = new Ball();
        b3.setRadius_sm(15);
        System.out.println(b2);
        b1.info();
        b2.info();
        b3.info();
    }
}
