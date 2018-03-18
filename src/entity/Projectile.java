package entity;

import util.Boundary;

public class Projectile extends GameObject{

    private double range;
    private double speed;
    private double armorpen;
    private double damage;
    private Boundary target;

    public Projectile() {
        super();
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getArmorpen() {
        return armorpen;
    }

    public void setArmorpen(double armorpen) {
        this.armorpen = armorpen;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public Boundary getTarget() {
        return target;
    }

    public void setTarget(Boundary target) {
        this.target = target;
    }
}
