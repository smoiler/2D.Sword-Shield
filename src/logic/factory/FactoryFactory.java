package logic.factory;

import entity.Factory;

import java.awt.*;

public class FactoryFactory {
    public static final String[] IMAGEPATHS =  {"/images/factory/factory1.png",
                                                "/images/factory/factory2.png",
                                                "/images/factory/factory3.png",
                                                "/images/factory/factory4.png"};

    public static final String[] NAMES = {"Factory Number I",
                                                "Factory Number II",
                                                 "Factory Number III",
                                                 "Factory Number IV"};
    public static final int[] COSTS = {100, 200, 300, 400};

    private static final int[] PRODUCTION_RATES = {1, 2, 3, 4};
    private static final int[] WIDTHS = {100, 75, 50, 25};
    private static final int[] HEIGHTS = {100, 75, 45, 50};

    public Factory create(int type, int x, int y) {
        Factory factory = new Factory();
        // TODO will be implemented
        return factory;
    }
}
