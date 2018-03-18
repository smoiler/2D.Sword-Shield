package logic.manager;

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

    // moves all projectiles towards their targets
    public void moveAll() {
        // TODO will be implemented after iteration I
    }

    // to remove projectiles that are out of range or hit to their target
    public void cleanDeads() {
        // TODO will be implemented after iteration I
    }

    public void render(Graphics g) {
        for (Projectile projectile : projectiles)
            g.drawImage(projectile.getImage(), projectile.getX(), projectile.getY(), null);
    }
}
