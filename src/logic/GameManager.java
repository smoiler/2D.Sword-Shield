package logic;

import logic.manager.*;
import util.User;

import java.awt.*;

public class GameManager {
    private static final int MAX_TURNS = 3;

    private User attackUser, defenseUser;
    private boolean currentTurn, gameOver;
    private int turnCount;

    private FactoryManager factoryManager;
    private SpaceshipManager spaceshipManager;
    private TurretManager turretManager;
    private ProjectileManager projectileManager;
    private ReactorManager reactorManager;

    public GameManager() {

    }
    public void initGame() {

    }

    public void buyTile(Point point) {

    }

    public void buyItem(Point point, int type) {

    }

    public boolean checkGameOver() {
        return turnCount > MAX_TURNS;
    }

    public void update() {

    }

    public void render(Graphics g) {
        factoryManager.render(g);
        projectileManager.render(g);
        reactorManager.render(g);
        spaceshipManager.render(g);
        turretManager.render(g);
    }



}
