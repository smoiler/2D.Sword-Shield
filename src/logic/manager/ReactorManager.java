package logic.manager;

import entity.Reactor;
import logic.factory.ReactorFactory;
import java.awt.*;
import java.util.ArrayList;

public class ReactorManager {

    private ArrayList<Reactor> reactors;
    private ReactorFactory reactorFactory;

    public ReactorManager() {
        reactors = new ArrayList<>();
        reactorFactory = new ReactorFactory();
    }

    public void add(int type, int x, int y) {
        // TODO will be implemented after iteration I
    }

    // returns the total gold collected from reactors at this iteration
    public int gatherGold() {
        // TODO will be implemented after iteration I
        return 4;
    }

    public void render(Graphics g) {
        for (Reactor reactor: reactors)
            g.drawImage(reactor.getImage(), reactor.getX(), reactor.getY(), null);
    }
}
