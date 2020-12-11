package com.products;

import com.products.Nutritious;

public abstract class Food implements Consumable, Nutritious {
    protected String name = null;
    int calories;
    public Food(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public  int getcalories(){return this.calories;}
    public int calculateCalories() {return this.calories;}
    public void consume(){};
    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object arg0)
    {
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food)arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }
    public boolean equals_type(Object arg0){
        if (!(arg0 instanceof Food)) return false;
        if (name == null || ((Food)arg0).name == null) {
            return false;
        }
        if (name.equals(((Food)arg0).name)){
            return true;
        }
        return false;
    }
}
