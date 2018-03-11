package logic.factory;

import entity.Factory;
import util.Boundary;

import java.awt.*;
import java.awt.image.BufferedImage;

public class FactoryFactory {

    //variables
    private static final int[] PRODUCTION_RATES = {1,2,3};
    private static final int[] COSTS = {300, 400, 500};
    private static final String[] IMAGE_PATHS = {"a.jpg","b.jpg","c.jpg"};
    private static final int[] WIDTHS = {100, 75, 50};
    private static final int[] HEIGHTS = {100, 75, 45};

    private static int type = 0;

    //operation
    public Factory createFactory(int type, Point point) {
        //new factory
        Factory fact = new Factory();

        //location for factory and image
        Boundary boo = new Boundary();
        boo.setWidth(WIDTHS[type]);
        boo.setHeight(HEIGHTS[type]);
        boo.setLocation(point);

        //features of the factory
        fact.setBoundary(boo);                              //location
        fact.setProductionRate(PRODUCTION_RATES[type]);     //speed
        fact.setImage(null);                                //image location will be added//
        fact.setCost(COSTS[type]);

        return fact;
    }

    //cost
    public double getCost(){
        return COSTS[type];
    }
}
