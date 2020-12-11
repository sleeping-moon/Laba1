package com.products;

public class Potatoes extends Food {
    private String type;
    private String fries = "fries";
    private String boiled = "boiled";
    private String fried = "fried";

    public Potatoes(String type1) {
        super("Potatoes");
        this.type = type1;
        if (this.type .equals(fried)) this.calories = 186;
        else if (this.type.equals( fries)) this.calories = 312;
        else this.calories = 86;
    }
    public void consume() {
        System.out.println(this + " has eaten");
    }

    public String gettype() {
        return type;
    }

    public String toString() {
        return super.toString() + " size of '" + type.toUpperCase() + "'";
    }
}