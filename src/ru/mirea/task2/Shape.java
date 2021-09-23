package ru.mirea.task2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){}
    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String c){

        this.color = c;
    }
    public boolean isFilled(){

        return this.filled;
    }
    public void setFilled(boolean f){

        this.filled = f;
    }
    public String toString(){

        return "color "+this.color+" ,filled - "+this.filled;
    }

}