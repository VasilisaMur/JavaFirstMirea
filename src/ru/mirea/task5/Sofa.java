package ru.mirea.task5;

public class Sofa extends Furniture {
    protected int length;
    public Sofa(String material, int price, int length){
        super(material, price);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public String toString(){
        return "Sofa: "+ "material - "+this.material+", length - "+ this.length+", price - "+this.price;
    }
}
