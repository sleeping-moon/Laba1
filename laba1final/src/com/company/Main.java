package com.company;
import com.products.*;

public class Main  {
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int countItems = 0;
        boolean marker = false;
        for (String arg : args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Pie")) {
                breakfast[countItems] = new Pie(parts[1].toLowerCase());
                countItems = countItems + 1;
            } else if (parts[0].equals("Potatoes")) {
                breakfast[countItems] = new Potatoes(parts[1].toLowerCase());
                countItems = countItems + 1;
            } else if (parts[0].equals("Tea")) {
                breakfast[countItems] = new Tea(parts[1].toLowerCase());
                countItems = countItems + 1;
            } else if (parts[0].equals("Milk")) {
                breakfast[countItems] = new Milk(parts[1].toLowerCase());
                countItems = countItems + 1;
            } else if (parts[0].equals("Burger")) {
                breakfast[countItems] = new Burger(parts[1].toLowerCase());
                countItems = countItems + 1;
            } else if (parts[0].equals("Lemonade")) {
                breakfast[countItems] = new Lemonade(parts[1].toLowerCase());
                countItems = countItems + 1;
            } else if (parts[0].equals("~calories")) {
                marker = true;
                countItems = countItems +1;
            } else {
                System.out.println("Cannot find class " + parts[0] + ".\nContinue...\n");
                countItems--;
            }
        }
        int counter = 0, sum = 0;
        if(marker == false) {
            for (String arg : args) {
                sum += breakfast[counter].calculateCalories();
                counter++;
            }
            System.out.println(sum);
        }
    }
}
