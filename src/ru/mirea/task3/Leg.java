package ru.mirea.task3;

public class Leg {
    private int health;
    public Leg(){
        this.health = 100;
    }
    public int getHealth(){
        return this.health;
    }

    public void broken(){
        this.health -= 50;
    }
}