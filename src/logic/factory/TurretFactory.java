package logic.factory;

import entity.Turret;

import java.awt.*;

public class TurretFactory {
    private static final int[] ATTACK_SPEEDS = {};
    private static final int[] COSTS = {};
    private static final String[] IMAGE_PATHS = {};
    private static final int[] WIDTHS = {};
    private static final int[] HEIGHTS = {};

    public Turret createTurret(int type, Point point) {
        Turret turret = new Turret();
        return turret;
    }
}
