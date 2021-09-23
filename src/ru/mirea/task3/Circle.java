package ru.mirea.task3;

public class Circle {
    private double radius;
    private String color;
    public Circle(){}

    public Circle(double r, String c){
        this.radius = r;
        this.color = c;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double r){
        this.radius = r;
    }

    public double getArea(){
        return 3.14*(this.radius)*(this.radius);
    }

    public double getLength(){
        return 2*3.14*this.radius;
    }
}
