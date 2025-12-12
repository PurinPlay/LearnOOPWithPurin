package ru.program.current;

public class Box extends Entity{
    private boolean looted;
    private boolean isOpen;
    public Box(String name, double health, double defence){
        super(name, health, defence);
        looted = false;
        isOpen = false;
    }

    @Override
    public void interact() {
        if (!isOpen){
            isOpen = true;
            System.out.println("Box now open");
        }else{
            isOpen = false;
            System.out.println("Box now closed");
        }
    }
    public void loot(){
        if(!isOpen){
            System.out.println("Box is closed");
            return;
        }
        if (!looted){
            looted = true;
            System.out.println("You looted box");
        }else {
            System.out.println("There is nothing to loot");
        }
    }
    @Override
    public void update() {
        System.out.println(name + " not moved");
    }
}
