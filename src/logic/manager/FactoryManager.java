package logic.manager;

import entity.Factory;
import entity.GameObject;
import logic.GameManager;
import logic.factory.FactoryFactory;

import java.awt.*;
import java.util.ArrayList;

public class FactoryManager {

    private ArrayList<Factory> factories;
    private FactoryFactory factoryFactory;

    public FactoryManager() {
        factories = new ArrayList<>();
        factoryFactory = new FactoryFactory();
    }
    public void add(int type, int x, int y) {
        // TODO will be implemented after iteration I
    }

    public ArrayList<GameObject> produceSpaceships() {
        ArrayList<GameObject> spaceships = new ArrayList<>();
        // TODO will be implemented after iteration I
        return spaceships;
    }

    public void render(Graphics g) {
        for (Factory factory: factories)
            g.drawImage(factory.getImage(), factory.getX(), factory.getY(), null);

    }

}
