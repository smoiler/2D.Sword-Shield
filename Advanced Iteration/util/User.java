package util;

import entity.EmptyTile;

public class User {
    private int turnsWon;
    private int health;
    private boolean usable=false;
    private double gold;

    public int getTurnsWon() {
        return turnsWon;
    }

    public void setTurnsWon(int turnsWon) {
        this.turnsWon = turnsWon;
    }

    public double getGold() {
        return gold;
    }

    public void setGold(double gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health){
        this.health=health;
    }

    public void setUsable(EmptyTile emp){
        this.usable = usable;
    }

    public boolean isUsable(EmptyTile emp){
        return usable;
    }

}
