package ru.program;

public class SpecBoost {
    private Specs spec;
    private int boost;
    public SpecBoost(Specs spec, int boost){
        this.spec = spec;
        this.boost = boost;
    }

    public int getBoost() {
        return boost;
    }

    public Specs getSpec() {
        return spec;
    }
}
