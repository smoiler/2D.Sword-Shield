package util;

public class User {
    private int score;
    private int gold;

    public User() {
        this.score = 0;
        this.gold = 800;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

}
