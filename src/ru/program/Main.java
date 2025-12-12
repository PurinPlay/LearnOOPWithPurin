package ru.program;

import ru.program.current.Box;
import ru.program.current.Entity;
import ru.program.current.Player;
import ru.program.current.Update;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity("Entity1", 50, 10) {
            @Override
            public void interact() {
                System.out.println("Interaction happened");
            }
            @Override
            public void update() {
                System.out.println(name + " updated");
            }
        };
        Entity entity2 = new Entity("Entity2", 50, 10) {
            @Override
            public void interact() {
                System.out.println("Dont touch me!");
            }
            @Override
            public void update() {
                System.out.println(name + " updated");
            }
        };
        System.out.println(entity);
        entity.interact();
        entity2.interact();

        Player heroEgorush = new Player("Egorysh", 1000, -5, 100, 2);
        heroEgorush.getStrength();
        heroEgorush.interact();
        System.out.println(heroEgorush);
        Box boxOfCox = new Box("Box of cocks", 100, 50);
        boxOfCox.interact();
        boxOfCox.interact();
        boxOfCox.loot();
        boxOfCox.interact();
        boxOfCox.loot();
        boxOfCox.loot();
        List<Entity> entities =  new ArrayList<>();
        entities.add(entity);
        entities.add(entity2);
        entities.add(boxOfCox);
        entities.add(heroEgorush);
        for (Entity ent : entities){
            ent.interact();
        }
        List<Update> updates =  new ArrayList<>();
        updates.add(entity);
        updates.add(entity2);
        updates.add(boxOfCox);
        updates.add(heroEgorush);
        while (true){
            Date start = new Date();
            for (Update update : updates){
                update.update();
            }
            Date end = new Date();
            System.out.println(end.getTime()-start.getTime());
        }
    }
}
