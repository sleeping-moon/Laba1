package com.products;

public class Pie extends Food {
    private String filling;
    private String cherry = "cherry";
    private String strawberry = "strawberry";
    private String apple = "apple";

    public Pie(String filling1) {
        super("Pie");
        this.filling = filling1;
        if (this.filling == cherry) this.calories = 270;
        else if (this.filling == strawberry) this.calories = 240;
        else this.calories = 237;
    }

    public void consume() {
        System.out.println(this + " has eaten");
    }

    public String getfilling() {
        return filling;
    }

    public String toString() {
        return super.toString() + " size of '" + filling.toUpperCase() + "'";
    }
}