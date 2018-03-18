package logic.manager;

import entity.Spaceship;
import logic.factory.SpaceshipFactory;

import java.awt.*;
import java.util.ArrayList;

public class SpaceshipManager {

    private ArrayList<Spaceship> spaceships;
    private SpaceshipFactory spaceshipFactory;

    public SpaceshipManager() {
        spaceships = new ArrayList<>();
        spaceshipFactory = new SpaceshipFactory();

        // TODO the following lines will be deleted after the demo
        // these lines are added just for the demo
        addSpaceship(1, 0, 230);
        addSpaceship(2, 0, 230);
    }

    public void addSpaceship(int type, int x, int y) {
        spaceships.add(spaceshipFactory.createSpaceship(type, x, y));
    }

    public void moveAll() {
        for (Spaceship spaceship : spaceships) {
            int newX = spaceship.getX() + spaceship.getSpeed();
            spaceship.setX(newX);
        }
    }

    public void render(Graphics g) {
        for (Spaceship spaceship : spaceships)
            g.drawImage(spaceship.getImage(), spaceship.getX(), spaceship.getY(), null);
    }
}
