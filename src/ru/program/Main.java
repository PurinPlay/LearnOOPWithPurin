package ru.program;

import java.util.Scanner;


public class Main{

    public static void show(Entity entity){
        System.out.println("It's " + entity.getName() + ". It has " + entity.getHealth() + "HP right now!");
    }
    static public void howManyExists(){
        System.out.println("There is " + Entity.getCount() + " entities exists!");
    }
    static public void cut(){
        System.out.println("======================================================\n");
    }

    public static void main(String[] args) {
        howManyExists();
        Entity dog = new Entity("Doge",50, 5, 5, 15, 0);
        show(dog);
        howManyExists();
        Entity newSameDog = dog;
        show(newSameDog);
        Entity sameDog = dog.self();
        show(sameDog);
        howManyExists();
        Entity copyDog = dog.copy();
        show(copyDog);
        howManyExists();
        Entity cat = new Entity("Nyan Cat",35, 3, 15, 20, 5);
        show(cat);
        howManyExists();
        cut();

        dog.takeDamage(10);
        show(dog);
        show(sameDog);
        show(copyDog);
        show(cat);
        cut();

        Entity.fight(cat, copyDog);
        show(copyDog);
        show(cat);

        Entity.fight(cat, copyDog);
        show(copyDog);
        show(cat);

        Entity.fight(cat, copyDog);
        show(copyDog);
        show(cat);
    }
}