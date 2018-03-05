package logic.manager;

import entity.GameObject;
import entity.Projectile;
import logic.factory.ProjectileFactory;

import java.awt.*;
import java.util.ArrayList;

public class ProjectileManager {

    private ArrayList<GameObject> projectiles;
    private ProjectileFactory projectileFactory;

    public void moveAll() {
        for (GameObject projectile : projectiles) {
            /**
             *
             *  Move'em
             *
             **/
        }
    }

    public void cleanDeads() {

    }

    public void render(Graphics g) {

    }
}
