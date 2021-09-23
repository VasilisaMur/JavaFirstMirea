package ru.mirea.task3;

public class HumanTest {
    public static void main(String[] args) {
        Leg l = new Leg();
        Hand h = new Hand();
        Head h1 = new Head();

        Human human = new Human(h1, l, h, 20);
        l.broken();
        System.out.println(human.getHealth());
    }
}