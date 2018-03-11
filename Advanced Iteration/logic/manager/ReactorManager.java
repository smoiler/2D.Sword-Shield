package logic.manager;

import entity.GameObject;
import entity.Reactor;
import logic.factory.ReactorFactory;
import util.Boundary;

import java.awt.*;
import java.util.ArrayList;

public class ReactorManager {

    private ArrayList<GameObject> reactors;
    private ReactorFactory reactorFactory;

    public void addReactor(int type, Point point) {
        Reactor rhea = new Reactor();

        Boundary boo = new Boundary();
        boo.setLocation(point);

        rhea.setBoundary(boo);
    }

    public int gatherGold() {
        return 1;
    }

    public void render(Graphics g) {

    }
}
