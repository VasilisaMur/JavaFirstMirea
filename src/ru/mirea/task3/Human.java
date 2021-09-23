package ru.mirea.task3;

public class Human {
    private Leg leg;
    private Head head;
    private Hand hand;
    private int age;
    public Human(Head head, Leg leg, Hand hand, int age){
        this.age = age;
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public int getAge(){
        return this.age;
    }
    public int getHealth(){
        return this.hand.getHealth()+ this.head.getHealth()+ this.leg.getHealth();
    }

}
