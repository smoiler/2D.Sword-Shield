package entity;

import gui.GamePanel;

public class Factory extends GameObject {

    private int productionRate;

    public Factory() {
        super();
    }

    public int getProductionRate() {
        return productionRate;
    }

    public void setProductionRate(int productionRate) {
        this.productionRate = productionRate;
    }
}
