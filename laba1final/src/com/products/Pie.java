package com.products;

public class Pie extends Food {
    private String filling;
    private String cherry = "cherry";
    private String strawberry = "strawberry";
    private String apple = "apple";

    public Pie(String filling) {
        super("Pie");
        this.filling = filling;
        if (filling.equals(cherry)) this.calories = 270;
        else if (filling.equals(strawberry)) this.calories = 240;
        else this.calories = 237;
    }

    public void consume() {
        System.out.println(this + " has eaten");
    }

    public String getfilling() {
        return filling;
    }

    public String toString() {
        return super.toString() + " filling '" + filling.toUpperCase() + "'";
    }
}