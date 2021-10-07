package ru.mirea.task7;

public class Rectangle extends Shape {
    double width = 1;
    double length = 1;

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;

    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(){}

    public double getWidth(){ return width; }
    public double getLength(){ return length; }
    public double getArea(){ return length*width; }
    public double getPerimeter(){ return (length+width)*2; }

    public void setWidth(double width){ this.width = width; }
    public void setLength(double length){ this.length = length; }

    public String toString(){
        return "Rectangle parameters:\nWidth: " + width + "\nLength: " + length + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n";
    }
}
