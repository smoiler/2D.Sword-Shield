package logic.factory;

import entity.Turret;
import util.Boundary;

import java.awt.*;

public class TurretFactory {

    //variables
    private static final int[] ATTACK_SPEEDS = {};
    private static final int[] COSTS = {};
    private static final String[] IMAGE_PATHS = {};
    private static final int[] WIDTHS = {};
    private static final int[] HEIGHTS = {};

    private static int type = 0;

    //operation
    public Turret createTurret(int type, Point point) {
        //new turret
        Turret blitz = new Turret();

        //location
        Boundary boo = new Boundary();
        boo.setHeight(HEIGHTS[type]);
        boo.setWidth(WIDTHS[type]);
        boo.setLocation(point);

        //features
        blitz.setCost(COSTS[type]);
        blitz.setAttackSpeed(ATTACK_SPEEDS[type]);
        blitz.setBoundary(boo);
        blitz.setImage(null);   //will be added//

        this.type=type;

        return blitz;
    }

    //cost
    public double getCost(){
        return COSTS[type];
    }
}
