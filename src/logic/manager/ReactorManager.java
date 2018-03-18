package logic.manager;

import entity.Factory;
import entity.GameObject;
import entity.Reactor;
import logic.factory.ReactorFactory;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class ReactorManager {

    private ArrayList<Reactor> reactors;
    private ReactorFactory reactorFactory;

    public ReactorManager() {
        reactors = new ArrayList<>();
        reactorFactory = new ReactorFactory();
    }

    public void add(int type, int x, int y) {

    }

    public int gatherGold() {
        // TODO implement this method
        return 4;
    }

    public void render(Graphics g) {
        if (reactors != null)
            for (Reactor reactor: reactors)
                g.drawImage(reactor.getImage(), reactor.getX(), reactor.getY(), null);
    }
}
