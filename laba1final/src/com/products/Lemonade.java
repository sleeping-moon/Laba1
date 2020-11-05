package com.products;

public class Lemonade extends Food{

    private String taste = null;

    public Lemonade(String taste1){
        super("Lemonade");
        this.taste = taste1;
        if(this.taste == "lemon") this.calories = 15;
        else if (this.taste == "orange") this.calories = 24;
        else this.calories = 27;
    }

    public void settaste(String taste){
        this.taste = taste;
    }

    public String gettaste(){
        return taste;
    }

    public void consume(){
        System.out.println(this + " has been drunk");
    }

    /*public boolean equals(Object arg0)
    {
        if (!super.equals(arg0))
        {
            return false;
        }
        if(((Lemonade)arg0).getTaste() == this.getTaste() && ((Lemonade)arg0).getAlc() == this.getAlc()){
            return true;
        } else{
            return false;
        }
    }*/
}
