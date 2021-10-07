package ru.mirea.task5;

public class Dachshund extends Dog{ //такса
    public Dachshund(String name, int age){
        super(name, age);
    }
    public String toString(){
        return "Dachshund:" + " name" + this.getName()+", age "+ this.getAge();
    }
}
