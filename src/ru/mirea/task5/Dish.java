package ru.mirea.task5;

public abstract class Dish {
    protected boolean clean;
    protected String meal;
    public Dish(String m, boolean c){
        this.meal = m;
        this.clean = c;
    }

    public String getMeal() {
        return meal;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public void setMeal(String m) {
        this.meal = m;
    }
}
