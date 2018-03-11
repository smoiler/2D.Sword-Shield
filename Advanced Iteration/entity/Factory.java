package entity;

import gui.GamePanel;

public class Factory extends GameObject {

    private int productionRate;
    private double cost;

    public int getProductionRate() {
        return productionRate;
    }

    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
