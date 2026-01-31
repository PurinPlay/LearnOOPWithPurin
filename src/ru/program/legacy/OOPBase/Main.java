package ru.program.legacy.OOPBase;


public class Main{

    public static void show(Entity entity){
        System.out.println("It's " + entity.getName() + ". It has " + entity.getHealth() + "HP right now!");
    }
    static public void howManyExists(){
        System.out.println("There is " + Entity.getCount() + " entities exists!");
    }
    static public void howTo(String title){
        System.out.println("================== How to " + title + " =================");
    }
    static public void cut(){
        System.out.println("======================================================\n");
    }
    /* OUTDATED
    public static void main(String[] args) {
        howTo("Static properties, initialisation, copies, constructor, duplicates");
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

        howTo("Method");
        dog.takeDamage(10);
        show(dog);
        show(sameDog);
        show(copyDog);
        show(cat);
        cut();

        howTo("Static method");
        Entity.fight(cat, copyDog);
        show(copyDog);
        show(cat);

        Entity.fight(cat, copyDog);
        show(copyDog);
        show(cat);

        Entity.fight(cat, copyDog);
        show(copyDog);
        show(cat);
        cut();

        howTo("destructor"); //didn't work due to code being too short and trash cleaner have no time to delete unused code
        howManyExists();
        cut();

        Prophesy prophesy = Prophesy.DRUID;

        System.out.println(prophesy);

    }*/
    /* outdated 2
    public static void main(String[] args) {
        Entity cat2 = new Entity("Nyan cat", Prophesy.ROGUE, 100, 15, 50, 20, 0);
        Entity cat1 = new Entity("Waffle cat", Prophesy.WARRIOR, 100, 15, 50, 20, 0);
        howTo("Enum");
        show(cat1);
        show(cat2);

        Entity.fight(cat1, cat2);
        show(cat1);
        show(cat2);
        Entity.fight(cat1, cat2);
        show(cat1);
        show(cat2);
        Entity.fight(cat1, cat2);
        show(cat1);
        show(cat2);
        Entity.fight(cat1, cat2);
        show(cat1);
        show(cat2);
        Entity.fight(cat1, cat2);
        show(cat1);
        show(cat2);
    }

     */
}