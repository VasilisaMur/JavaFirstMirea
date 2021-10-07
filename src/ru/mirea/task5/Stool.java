package ru.mirea.task5;

public class Stool extends Furniture{ //табуретка
    public int height;
    public Stool(String m, int pr, int height){
        super(m,pr);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public String toString(){
        return "Stool: "+ "material - "+this.material+", height - "+ this.height+", price - "+this.price;
    }

}
