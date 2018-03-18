package logic.manager;

import entity.GameObject;
import entity.Projectile;
import entity.Turret;
import logic.factory.TurretFactory;

import java.awt.*;
import java.util.ArrayList;

public class TurretManager {

    private ArrayList<Turret> turrets;
    private TurretFactory turretFactory;

    public TurretManager() {
        turrets = new ArrayList<>();
        turretFactory = new TurretFactory();
    }

    // adds a turret of the given type at the given location
    public void add(int type, int x, int y) {

    }

    // returns fired projectiles on this iteration
    public ArrayList<GameObject> fireProjectiles() {
        ArrayList<GameObject> projectiles = new ArrayList<>();

        for (Turret turret : turrets) {

        }

        return projectiles;
    }

    public void render(Graphics g) {
        if (turrets != null)
            for (Turret turret: turrets) {
                g.drawImage(turret.getImage(), turret.getX(), turret.getY(), null);
            }
    }

}
