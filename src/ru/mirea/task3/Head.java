package ru.mirea.task3;

public class Head {
    private int health;
    public Head(){
        this.health = 100;
    }
    public int getHealth(){
        return this.health;
    }

    public void broken(){
        this.health -= 50;
    }
}
