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

    public void addTurret(int type, int x, int y) {

    }

    public ArrayList<GameObject> fireProjectiles() {
        ArrayList<GameObject> projectiles = new ArrayList<>();

        for (Turret turret : turrets) {

        }

        return projectiles;
    }

    public void render(Graphics g) {

    }

}
