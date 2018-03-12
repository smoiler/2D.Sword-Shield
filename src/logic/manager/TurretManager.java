package logic.manager;

import entity.GameObject;
import entity.Projectile;
import logic.factory.TurretFactory;

import java.awt.*;
import java.util.ArrayList;

public class TurretManager {


    private ArrayList<GameObject> turrets;
    private TurretFactory turretFactory;

    public ArrayList<GameObject> fireProjectiles() {
        ArrayList<GameObject> projectiles = new ArrayList<>();

        for (GameObject turret : turrets) {

        }

        return projectiles;
    }

    public void render(Graphics g) {

    }

}
