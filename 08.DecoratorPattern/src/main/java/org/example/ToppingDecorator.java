package org.example;

abstract class ToppingDecorator implements Bhel{

    protected Bhel tempBhel;

    public ToppingDecorator(Bhel newBhel){

        tempBhel = newBhel;
    }

    public String getDescription(){
        return tempBhel.getDescription();
    }

    public double getCalories(){
        return tempBhel.getCalories();
    }


}
