package logic;

import logic.manager.*;
import util.User;

import java.awt.*;

public class GameManager {
    private static final int MAX_TURNS = 3;

    private User attacker, defender;
    private boolean currentTurn, gameOver;
    private int turnCount;
    private int timeLeft;

    private FactoryManager factoryManager;
    private SpaceshipManager spaceshipManager;
    private TurretManager turretManager;
    private ProjectileManager projectileManager;
    private ReactorManager reactorManager;

    public GameManager() {
        attacker = new User();
        defender = new User();
        currentTurn = false;
        gameOver = false;
        timeLeft = 0;
        turnCount = 0;
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

    public int getDefenderScore() {
        return defender.getScore();
    }

    public int getAttackerScore() {
        return attacker.getScore();
    }

    public int getAttackerGold() {
        return attacker.getGold();
    }

    public int getDefenderGold() {
        return defender.getGold();
    }

    public int getTimeLeft() {
        return timeLeft;
    }

    public void render(Graphics g) {
        factoryManager.render(g);
        projectileManager.render(g);
        reactorManager.render(g);
        spaceshipManager.render(g);
        turretManager.render(g);
    }



}
