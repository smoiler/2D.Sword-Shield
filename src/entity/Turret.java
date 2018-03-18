package entity;

public class Turret extends GameObject {

    private int attackSpeed;

    public Turret() {
        super();
    }

    public int getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(int attackSpeed) {
        this.attackSpeed = attackSpeed;
    }
}
