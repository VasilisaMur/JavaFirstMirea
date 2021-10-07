package ru.mirea.task5;

public abstract class Furniture {
    protected String material;
    protected int price;
    public Furniture(String material, int price){
        this.material = material;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
