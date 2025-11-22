package ru.program;

public class Entity {

    private static int count = 0;

    private double health;
    private double stamina;

    private String name;
    private int maxHealth;
    private int defence;
    private int agility;
    private int strength;
    private int magicPower;

    public Entity(String name, int maxHealth, int defence, int agility, int strength, int magicPower){
        count++;
        this.name = name;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.health = this.maxHealth;
        stamina = 100;
    }

    public double getHealth() {
        return health;
    }
    public double getStamina() {
        return stamina;
    }

    public double heal(double amount){
        health += amount;
        return health;
    }

    public double takeDamage(double amount){
        health -= amount;
        return health;
    }

    public Entity self(){
        return this;
    }
    public Entity copy(){
        Entity copy = new Entity(name, maxHealth, defence, agility, strength, magicPower);
        copy.health = health;
        copy.stamina = stamina;
        return copy;
    }

    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth;
    }
    public int getDefence() {
        return defence;
    }
    public int getAgility() {
        return agility;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getStrength() {
        return strength;
    }

    static public int getCount(){
        return count;
    }

    public static void fight(Entity entity1, Entity entity2){
        Entity first = (entity1.agility >= entity2.agility) ? entity1 : entity2
                , second = (entity1.agility < entity2.agility) ? entity1 : entity2;

        if (first.health > 0) {
            second.takeDamage(first.strength);
        }
        if (second.health > 0){
            first.takeDamage(second.strength);
        }
    }
}
