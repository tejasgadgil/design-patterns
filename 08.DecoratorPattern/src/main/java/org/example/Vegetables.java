package org.example;

public class Vegetables extends ToppingDecorator{

    public Vegetables(Bhel newBhel) {
        super(newBhel);

        System.out.println("Adding Vegetables");
    }

    public String getDescription(){
        return tempBhel.getDescription() + ", 50g onion, 50g tomato, 60g boiled potato";
    }

    public double getCalories(){
        return tempBhel.getCalories() + 20 + 10 + 50;
    }


}