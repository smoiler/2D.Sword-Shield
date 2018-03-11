package logic.factory;

import entity.Projectile;
import util.Boundary;

import java.awt.*;

public class ProjectileFactory {

    //variables
    private static final double[] SPEEDS  = {4,5,6,7};
    private static final double[] ARMORPENS = {2.3, 4.5, 5.6, 6.7};
    private static final double[] DAMAGES = {3.4, 5.4, 3.3, 2.2};
    private static final double[] RANGES = {45, 44, 23.25, 45.5};
    private static final String[] IMAGE_PATHS = {"a.jpg", "b.jpg", "c.jpg", "d.jpg"};
    private static final int[] WIDTHS = {55, 66, 35, 103};
    private static final int[] HEIGHTS = {55, 45, 35, 105};

    //operation
    public Projectile createProjectile(int type, Point point) {
        //new projectile
        Projectile pro = new Projectile();

        //location
        Boundary boo = new Boundary();  //itself
        boo.setHeight(WIDTHS[type]);
        boo.setWidth(WIDTHS[type]);
        boo.setLocation(point);

        Boundary tar = new Boundary();  //target

        //features
        double proAP=0,proDMG=0,proRNG=0,proSPD=0;

        proAP = ARMORPENS[type];
        proDMG = DAMAGES[type];
        proRNG = RANGES[type];
        proSPD = SPEEDS[type];

        //apply features
        pro.setArmorpen(proAP);
        pro.setDamage(proDMG);
        pro.setRange(proRNG);
        pro.setSpeed(proSPD);
        pro.setTarget(tar);

        pro.setBoundary(boo);
        tar.setLocation(null);

        pro.setImage(null);            //image location will be added//

        return pro;

    }
}
