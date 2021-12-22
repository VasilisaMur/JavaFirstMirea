package ru.mirea.task29;


import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private double dollar;
    private double euro;


    public CurrencyInfo(double dollar, double euro){
        this.dollar = dollar;
        this.euro = euro;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getDollar() {
        return dollar;
    }

    public void setDollar(double dollar) {
        this.dollar = dollar;
    }

    public double getEuro() {
        return euro;
    }

    public void setEuro(double euro) {
        this.euro = euro;
    }


    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "dollar=" + dollar +
                ", euro=" + euro +
                '}';
    }
}
