package logic.factory;

import entity.Turret;
import util.FileManager;

public class TurretFactory {

    // Turret properties
    public static final String[] IMAGEPATHS =  {"/images/turret/turret1.png",
                                                "/images/turret/turret2.png",
                                                "/images/turret/turret3.png",
                                                "/images/turret/turret4.png"};

    public static final String[] NAMES = {"Turret Number I",
                                                 "Turret Number II",
                                                 "Turret Number III",
                                                 "Turret Number IV"};

    public static final int[] COSTS = {100, 200, 300, 400};
    private static final int[] ATTACK_SPEEDS = {1, 2, 3, 4};
    private static final int[] WIDTHS = {50, 75, 85, 80};
    private static final int[] HEIGHTS = {50, 75, 85, 90};

    // File Manager
    FileManager fileManager;

    public TurretFactory() {
        fileManager = FileManager.getInstance();
    }

    public Turret create(int type, int x, int y) {
        Turret turret = new Turret();
        // TODO will be implemented
        return turret;
    }
}
