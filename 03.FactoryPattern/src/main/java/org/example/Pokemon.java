package org.example;

public class Pokemon {

    private String name;
    private double damage;
    private String sound;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double newDamage) {
        this.damage = newDamage;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void exitPokeball(){
        System.out.println("You have chosen " + getName());
    }

    public void pokemonSaysHello(){
        System.out.println(getName() + " says " + getSound() + "!!");
    }

    public void doPokemonDamage(){
        System.out.println("Your " + getName() + " has done " + getDamage());
    }

}
