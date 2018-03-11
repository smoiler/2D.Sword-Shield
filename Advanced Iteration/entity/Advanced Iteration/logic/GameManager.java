package logic;

import entity.EmptyTile;
import javafx.scene.layout.TilePane;
import logic.factory.TurretFactory;
import logic.factory.ReactorFactory;
import logic.factory.FactoryFactory;
import logic.manager.*;
import util.Boundary;
import util.User;

import java.awt.*;

//game management system
public class GameManager {
    //variables
    private static final int MAX_TURNS = 3;
    private User attackUser, defenseUser;
    private boolean currentTurn, gameOver;
    private int turnCount;

    //managements
    private FactoryManager factoryManager;
    private SpaceshipManager spaceshipManager;
    private TurretManager turretManager;
    private ProjectileManager projectileManager;
    private ReactorManager reactorManager;

    //game management constructor
    public GameManager() {
        //start up status
        attackUser.setGold(1000);
        defenseUser.setGold(1000);

        attackUser.setHealth(2000);
        defenseUser.setHealth(2000);

        turnCount=0;

        //game process
        initGame();

        while(!checkGameOver()){
            update();

        }
    }

    //game initiator
    public void initGame() {
        //new Game();
    }

    //tile purchase
    public void buyTile(Point point, User user) {
        //the empty tile and location
        EmptyTile taken = new EmptyTile();
        Boundary boo = new Boundary();
        boo.setLocation(point);
        taken.setBoundary(boo);

        //check and update availability
        if(user==attackUser & defenseUser.isUsable(taken)==false)
            user.setUsable(taken);
        else if(user==defenseUser & attackUser.isUsable(taken)==false)
            user.setUsable(taken);

        //update balance of user
        updateGold(user, taken.getCost());

    }

    //item purchase
    public void buyItem(Point point, int type, User user) {
        switch(type){

            //turret item case
            case 1:
                //new turret
                TurretFactory turry = new TurretFactory();
                turry.createTurret(type,point);

                //update balance
                updateGold(user, turry.getCost());

                break;

            //reactor item case
            case 2:
                ReactorFactory rei = new ReactorFactory();
                rei.createReactor(point);

                //update balance
                updateGold(user, rei.getCost());

                break;

            //factory item case
            case 3:
                FactoryFactory fancy = new FactoryFactory();
                fancy.createFactory(type,point);

                //update balance
                updateGold(user, fancy.getCost());

                break;
        }
    }

    //game over status checker
    public boolean checkGameOver() {
        return turnCount > MAX_TURNS;
    }

    //update game status
    public void update() {
        turnCount++;

        attackUser.setHealth(2000);
        defenseUser.setHealth(2000);
    }

    //update balance of correlating user
    public void updateGold(User user, double cost){
        if(cost>user.getGold())
            throw new IllegalArgumentException("Insufficient funds");
        else
            user.setGold(user.getGold()-cost);

    }

    //execute managers
    public void render(Graphics g) {
        factoryManager.render(g);
        projectileManager.render(g);
        reactorManager.render(g);
        spaceshipManager.render(g);
        turretManager.render(g);
    }

}
