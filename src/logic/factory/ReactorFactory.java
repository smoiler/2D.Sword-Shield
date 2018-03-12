package logic.factory;

import entity.Reactor;

import java.awt.*;

public class ReactorFactory {

    private static final int INCOME_RATE = 5;
    private static final int INCOME = 5;
    private static final int COST = 5;
    private static final String IMAGE_PATH = "a.jpg";
    private static final int WIDTH = 55;
    private static final int HEIGHT = 100;

    public Reactor createReactor(Point point) {
        Reactor reactor = new Reactor();

        return reactor;
    }

    public int getCost() {
        return COST;
    }
}
