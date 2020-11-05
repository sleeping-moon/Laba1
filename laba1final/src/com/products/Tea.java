package com.products;

public class Tea extends Food {
    private String color;

    public Tea(String color1) {
        super("Tea");
        this.color = color1;
        this.calories = 0;
    }

    public void consume() {
        System.out.println(this + " has been drunk");
    }

    public String getcolor() {
        return color;
    }

    public String toString() {
        return super.toString() + " size of '" + color.toUpperCase() + "'"; }
}