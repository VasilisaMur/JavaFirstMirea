package ru.mirea.task5;

public class Pot extends Dish{
    public int radius;

    public Pot(String meal, boolean clean) {
        super(meal, clean);
    }

    public Pot(String meal, boolean clean, int radius) {
        super(meal, clean);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }



    @Override
    public String toString() {
        return "meal -  "+this.meal+", clean - "+ this.clean+", radius - "+this.radius;
    }
}
