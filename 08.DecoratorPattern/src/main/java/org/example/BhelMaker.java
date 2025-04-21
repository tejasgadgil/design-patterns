package org.example;

public class BhelMaker {
    public static void main(String[] args) {

        System.out.println("Hello there! Enjoy your basic bhel!");

        Bhel basicBhel = new Shev(new Chutney(new Churmure()));

        System.out.println("Ingredients: " + basicBhel.getDescription());
        System.out.println("Calories: " + basicBhel.getCalories());


        System.out.println("Want another? Enjoy your advanced bhel!");

        Bhel advBhel = new Vegetables(new GreenChilli(new Shev(new Chutney(new Churmure()))));

        System.out.println("Ingredients: " + advBhel.getDescription());
        System.out.println("Calories: " + advBhel.getCalories());

    }
}