package com.products;

public class Burger extends Food {
    private String size;
    private String small = "small";
    private String middle = "middle";
    private String big = "big";

    public Burger(String size1) {
        super("Burger");
        this.size = size1;
        if (this.size.equals(small)) this.calories = 270;
        else if (this.size.equals(middle)) this.calories = 320;
        else this.calories = 400;
    }
    public void consume() {
        System.out.println(this + " has eaten");
    }

    public String getsize() {
        return size;
    }

    public String toString() {
        return super.toString() + " size of '" + size.toUpperCase() + "'";
    }
}