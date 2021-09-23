package ru.mirea.task2;

public class Ball {
    private String colour;
    private int radius_sm;

    public Ball(String c, int r) {
        this.colour = c;
        this.radius_sm = r;
    }

    public Ball(String c) {
        this.colour = c;
        this.radius_sm = 10;
    }

    public Ball() {
        this.colour = "red";
        this.radius_sm = 10;
    }

    public void setColour(String c) {
        this.colour = c;
    }

    public void setRadius_sm(int r) {
        this.radius_sm = r;
    }

    public String getColour() {
        return this.colour;
    }

    public int getRadius_sm() {
        return this.radius_sm;
    }

    public String toString() {
        return "colour " + this.colour + ", radius " + this.radius_sm;
    }

    public void info() {
        System.out.println("this ball is " + this.colour + " and has a radius of " + this.radius_sm);
    }
}
