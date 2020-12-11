package com.products;

public class Milk extends Food {
    private String fat;

    public Milk(String fat1) {
        super("Milk");
        this.fat = fat1;
        if (this.fat.equals("1.5")) this.calories = 45;
        else if (this.fat.equals("2.5")) this.calories = 52;
        else this.calories = 75;
    }

    public void consume() {
        System.out.println(this + " has been drunk");
    }

    public String getfat() {
        return fat;
    }

    public String toString() {
        return super.toString() + " size of '" + fat.toUpperCase() + "'";
    }
}