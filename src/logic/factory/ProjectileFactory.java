package logic.factory;

import entity.Projectile;

import java.awt.*;

public class ProjectileFactory {
    public static final String[] IMAGEPATHS =  {"/images/projectile/projectile1.png",
                                                "/images/projectile/projectile2.png",
                                                "/images/projectile/projectile3.png",
                                                "/images/projectile/projectile4.png"};

    private static final double[] SPEEDS  = {4,5,6,7};
    private static final double[] ARMORPENS = {2.3, 4.5, 5.6, 6.7};
    private static final double[] DAMAGES = {3.4, 5.4, 3.3, 2.2};
    private static final double[] RANGES = {45, 44, 23.25, 45.5};
    private static final int[] WIDTHS = {55, 66, 35, 103};
    private static final int[] HEIGHTS = {55, 45, 35, 105};

    public Projectile createProjectile(int type, Point point) {
        Projectile projectile = new Projectile();

        return projectile;
    }
}
