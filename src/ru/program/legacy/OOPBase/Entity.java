package ru.program.legacy.OOPBase;

public class Entity {

    //List<Entity> allies;
    Prophesy prophesy;

    private static int count = 0;

    private double health;
    private double stamina;

    private String name;
    private int maxHealth;
    private int defence;
    private int agility;
    private int strength;
    private int magicPower;

    public Entity(String name, Prophesy prophesy, int maxHealth, int defence, int agility, int strength, int magicPower){
        //allies = new ArrayList<>();
        this.prophesy = prophesy;
        count++;
        this.name = name;
        this.maxHealth = maxHealth;
        this.strength = strength;
        this.agility = agility;
        this.health = getMaxHealth();
        stamina = 100;
    }

    public int boost(Specs spec){
        switch (spec){
            case HEALTH -> {
                return maxHealth + prophesy.getProphesyBoost(spec);
            }
            case DEFENCE -> {
                return defence + prophesy.getProphesyBoost(spec);
            }
            case STRENGTH -> {
                return strength + prophesy.getProphesyBoost(spec);
            }
            case AGILITY -> {
                return agility + prophesy.getProphesyBoost(spec);
            }
            case MAGIC_POWER -> {
                return magicPower + prophesy.getProphesyBoost(spec);
            }
        }
        return 0;
    }

    @Override
    protected void finalize(){
        count--;
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
        Entity copy = new Entity(name, prophesy, maxHealth, defence, agility, strength, magicPower);
        copy.health = health;
        copy.stamina = stamina;
        return copy;
    }

    public Entity copy(boolean isClone){
        if (isClone){
            return self();
        }else {
            return copy();
        }
    }

    public String getName() {
        return name;
    }
    public int getMaxHealth() {
        return maxHealth + boost(Specs.HEALTH);
    }
    public int getDefence() {
        return defence;
    }
    public int getAgility() {
        return agility + boost(Specs.AGILITY);
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getStrength() {
        return strength + boost(Specs.STRENGTH);
    }

    static public int getCount(){
        return count;
    }

    public static void fight(Entity entity1, Entity entity2){
        Entity first = (entity1.getAgility() >= entity2.getAgility()) ? entity1 : entity2
                , second = (entity1.getAgility() < entity2.getAgility()) ? entity1 : entity2;

        if (first.health > 0) {
            second.takeDamage(first.getStrength());
        }
        if (second.health > 0){
            first.takeDamage(second.getStrength());
        }
    }
}
