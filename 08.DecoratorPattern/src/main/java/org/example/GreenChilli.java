package org.example;

public class GreenChilli extends ToppingDecorator{

    public GreenChilli(Bhel newBhel) {
        super(newBhel);

        System.out.println("Adding GreenChilli");
    }

    public String getDescription(){
        return tempBhel.getDescription() + ", green chilli for spice";
    }

    public double getCalories(){
        return tempBhel.getCalories() + 5;
    }


}