package logic.manager;

import entity.GameObject;
import entity.Projectile;
import logic.factory.ProjectileFactory;

import java.awt.*;
import java.util.ArrayList;

public class ProjectileManager {

    private ArrayList<Projectile> projectiles;
    private ProjectileFactory projectileFactory;

    public ProjectileManager() {
        projectiles = new ArrayList<>();
        projectileFactory = new ProjectileFactory();
    }
    public void moveAll() {
        for (Projectile projectile : projectiles) {

        }
    }

    // to remove projectiles that are out of range or hit to their target
    public void cleanDeads() {
    }

    public void render(Graphics g) {
        if (projectiles != null)
            for (Projectile projectile : projectiles)
                g.drawImage(projectile.getImage(), projectile.getX(), projectile.getY(), null);
    }
}
