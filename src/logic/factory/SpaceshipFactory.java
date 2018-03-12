package logic.factory;

import entity.Spaceship;

import java.awt.*;

public class SpaceshipFactory {
    public static final String[] IMAGEPATHS =  {"/images/spaceship/spaceship1.png",
                                                "/images/spaceship/spaceship2.png",
                                                "/images/spaceship/spaceship3.png",
                                                "/images/spaceship/spaceship4.png"};

    private static final double[] SPEEDS = {5, 6, 7, 8};
    private static final double[] ARMORS = {3.3, 4.5, 2.5, 1.9};
    private static final double[] HPS = {899, 323, 234, 456};
    private static final int[] WIDTHS = {55, 75, 65, 100};
    private static final int[] HEIGHTS = {65, 35, 85, 100};

    public Spaceship createSpaceship(int type, Point point) {
        Spaceship spaceship = new Spaceship();
        return spaceship;
    }
}
