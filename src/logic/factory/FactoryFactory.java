package logic.factory;

import entity.Factory;

import java.awt.*;

public class FactoryFactory {

    private static final int[] PRODUCTION_RATES = {1,2,3};
    private static final int[] COSTS = {300, 400, 500};
    private static final String[] IMAGE_PATHS = {"a.jpg","b.jpg","c.jpg"};
    private static final int[] WIDTHS = {100, 75, 50};
    private static final int[] HEIGHTS = {100, 75, 45};

    public Factory createFactory(int type, Point point) {

    }

    public int getCost(int type) {
        return COSTS[type];
    }
}
