package logic.manager;

import entity.Factory;
import entity.GameObject;
import logic.GameManager;
import logic.factory.FactoryFactory;

import java.awt.*;
import java.util.ArrayList;

public class FactoryManager {

    private ArrayList<GameObject> factories;
    private FactoryFactory factoryFactory;

    public void addFactory(int type, Point point) {

    }


    public ArrayList<GameObject> produceSpaceships() {
        ArrayList<GameObject> spaceships = new ArrayList<>();

        for (GameObject factory: factories) {

        }

        return spaceships;
    }

    public void render(Graphics g) {

    }

}
