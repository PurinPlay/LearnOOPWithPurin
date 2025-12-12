package ru.program.legacy;

public enum Prophesy {
    WARRIOR("Воин", new SpecBoost[]{
            new SpecBoost(Specs.STRENGTH, 25),
            new SpecBoost(Specs.DEFENCE, 5),
            new SpecBoost(Specs.HEALTH, 15)
    }),
    ROGUE("Плут", new SpecBoost[]{
            new SpecBoost(Specs.AGILITY, 30),
            new SpecBoost(Specs.DEFENCE, -5),
            new SpecBoost(Specs.STRENGTH, 10)
    }),
    SORCERER("Чародей", new SpecBoost[]{
            new SpecBoost(Specs.MAGIC_POWER, 75),
            new SpecBoost(Specs.DEFENCE, -25)
    }),
    RANGER("Дальник", new SpecBoost[]{
            new SpecBoost(Specs.AGILITY, 50),
            new SpecBoost(Specs.DEFENCE, -10)
    }),
    DRUID("Друид", new SpecBoost[]{
            new SpecBoost(Specs.MAGIC_POWER, 20),
            new SpecBoost(Specs.HEALTH, 10)
    });

    private String name;
    private SpecBoost[] boosts;
    Prophesy(String name, SpecBoost[] boosts){
        this.boosts = boosts;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    public SpecBoost[] boosts(){
        return boosts;
    }
    public int getProphesyBoost(Specs specs){
        for(SpecBoost boost : boosts){
            if (boost.getSpec() == specs){
                return boost.getBoost();
            }
        }
        return 0;
    }
}
