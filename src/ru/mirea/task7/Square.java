package ru.mirea.task7;

public class Square extends Rectangle {
    public Square(){}

    public Square(double Side) {
        this.length = Side;
        this.width = Side;
    }

    public Square(double side, String color, boolean filled) {
        this.length = side;
        this.color = color;
        this.filled = filled;
    }

    public void setSide(double Side){
        this.length = Side;
        this.width = Side;
    }

    public double getSide(){ return length; }
    public void setWidth(double Width){ this.width = Width; }
    public void setLength(double Length){ this.length = Length; }
    public String toString(){
        return "Square parameters:\nSide: " + length + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n";
    }
}
