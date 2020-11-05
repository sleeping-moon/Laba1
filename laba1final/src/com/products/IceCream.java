package com.products;

public class IceCream extends Food {
    private String sirup;
    private String caramel = "caramel";

    public IceCream(String sirup1) {
        super("IceCream");
        this.sirup = sirup1;
        if (this.sirup == caramel) this.calories = 325;
        else this.calories = 315;
    }

    public void consume() { System.out.println(this + " has eaten"); }
    public String getsirup() { return sirup; }
    public String toString() { return super.toString() + " size of '" + sirup.toUpperCase() + "'"; }
}