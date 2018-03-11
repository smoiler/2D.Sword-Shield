package logic.factory;

import entity.Reactor;
import util.Boundary;

import java.awt.*;

public class ReactorFactory {

    //variables
    private static final int INCOME_RATE = 5;
    private static final int INCOME = 5;
    private static final double  COST = 5;
    private static final String IMAGE_PATH = "a.jpg";
    private static final int WIDTH = 55;
    private static final int HEIGHT = 100;

    //operation
    public Reactor createReactor(Point point) {
        //new reactor
        Reactor rhea = new Reactor();

        //location
        Boundary boo = new Boundary();
        boo.setLocation(point);
        boo.setWidth(WIDTH);
        boo.setHeight(HEIGHT);

        //features
        rhea.setCost(COST);
        rhea.setIncome(INCOME);
        rhea.setIncomeRate(INCOME_RATE);
        rhea.setImage(null);                //image will be added//

        rhea.setBoundary(boo);

        return rhea;
    }

    //cost
    public double getCost(){
        return COST;
    }
}
