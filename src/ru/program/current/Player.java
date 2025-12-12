package ru.program.current;

public class Player extends Entity{
    protected double strength;
    protected double agility;
    public Player(String name, double health, double defence, double strength, double agility){
        super(name, health, defence);
        this.agility = agility;
        this.strength = strength;
    }

    @Override
    public void interact() {
        System.out.println("Interaction with player happened");
    }

    public double getAgility() {
        return agility;
    }

    public double getStrength() {
        return strength;
    }

    public void setAgility(double agility) {
        this.agility = agility;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    @Override
    public void update() {
        System.out.println(name + " moved");
    }
}
