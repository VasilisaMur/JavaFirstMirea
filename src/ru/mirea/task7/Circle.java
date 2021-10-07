package ru.mirea.task7;

public class Circle extends Shape {
    double radius = 1;

    public Circle(double Radius, String color, boolean filled){
        super(color,filled);
        this.radius = Radius;

    }

    public Circle(double Radius){
        this.radius = Radius;
    }

    public Circle(){}

    public double getRadius(){ return radius; }
    public double getArea(){ return 3.14 * radius; }
    public double getPerimeter(){ return 2* 3.14*radius; }

    public void setRadius(double radius){ this.radius = radius; }
    public String toString(){
        return "Circle parameters:\nRadius: " + radius + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n";
    }
}
