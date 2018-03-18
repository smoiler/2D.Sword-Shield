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

    public void addFactory(int type, int x, int y) {

    }


    public ArrayList<GameObject> produceSpaceships() {
        ArrayList<GameObject> spaceships = new ArrayList<>();

        for (Factory factory: factories) {

        }

        return spaceships;
    }

    public void render(Graphics g) {

    }

}
