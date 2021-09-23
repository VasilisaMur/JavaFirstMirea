package ru.mirea.task3;

public class Hand {
    private int health;
    public Hand(){
        this.health = 100;
    }
    public int getHealth(){
        return this.health;
    }

    public void broken(){
        this.health -= 50;
    }

}
