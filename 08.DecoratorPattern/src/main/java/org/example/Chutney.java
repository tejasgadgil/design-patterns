package org.example;

public class Chutney extends ToppingDecorator{

    public Chutney(Bhel newBhel) {
        super(newBhel);

        System.out.println("Adding Chutney");
    }

    public String getDescription(){
        return tempBhel.getDescription() + ", 15g Chutney";
    }

    public double getCalories(){
        return tempBhel.getCalories() + 40;
    }


}