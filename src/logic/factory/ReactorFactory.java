package logic.factory;

import entity.Reactor;

import java.awt.*;

public class ReactorFactory {
    public static final String IMAGEPATH = "/images/reactor/reactor.png";
    public static final String NAME = "Reactor";
    public static final int COST = 5;

    private static final int INCOME_RATE = 5;
    private static final int INCOME = 5;
    private static final int WIDTH = 55;
    private static final int HEIGHT = 100;

    public Reactor create(int x, int y) {
        Reactor reactor = new Reactor();
        // TODO will be implemented
        return reactor;
    }

    public int getCost() {
        return COST;
    }
}
