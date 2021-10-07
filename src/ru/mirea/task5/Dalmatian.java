package ru.mirea.task5;

public class Dalmatian extends Dog { //далматинец
    public Dalmatian(String name, int age){
        super(name, age);
    }
    public String toString(){
        return "Dalmatian:" + " name" + this.getName()+", age "+ this.getAge();
    }
}
