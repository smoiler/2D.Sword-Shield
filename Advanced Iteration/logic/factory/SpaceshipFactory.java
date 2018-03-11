package logic.factory;

import entity.Spaceship;
import util.Boundary;

import java.awt.*;

public class SpaceshipFactory {

    //variables
    private static final double[] SPEEDS = {5, 6, 7, 8};
    private static final double[] ARMORS = {3.3, 4.5, 2.5, 1.9};
    private static final double[] HPS = {899, 323, 234, 456};
    private static final String[] IMAGE_PATHS = {"a.jpg", "b.jpg", "c.jpg", "d.jpg"};
    private static final int[] WIDTHS = {55, 75, 65, 100};
    private static final int[] HEIGHTS = {65, 35, 85, 100};

    //operation
    public Spaceship createSpaceship(int type, Point point) {
        //new starship
        Spaceship starlight = new Spaceship();

        //location
        Boundary boo = new Boundary();
        boo.setHeight(HEIGHTS[type]);
        boo.setWidth(WIDTHS[type]);
        boo.setLocation(point);

        //features
        starlight.setArmor(ARMORS[type]);
        starlight.setHp(HPS[type]);
        starlight.setReward(type*50);          //reward will be added//
        starlight.setSpeed(SPEEDS[type]);

        starlight.setImage(null);           //image will be added//
        starlight.setBoundary(boo);

        return starlight;
    }
}
