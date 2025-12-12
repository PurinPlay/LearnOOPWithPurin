package ru.program.current;

public abstract class Entity implements Update {
    protected String name;
    protected double health;
    protected double defence;

    public Entity(String name, double health, double defence){
        this.name = name;
        this.health = health;
        this.defence = defence;
    }
    public abstract void interact();

    @Override
    public String toString() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getDefence() {
        return defence;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setDefence(double defence) {
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
