package org.example;

public class Shev extends ToppingDecorator{

    public Shev(Bhel newBhel) {
        super(newBhel);

        System.out.println("Adding Shev");
    }

    public String getDescription(){
        return tempBhel.getDescription() + ", 25g Shev";
    }

    public double getCalories(){
        return tempBhel.getCalories() + 150;
    }


}
