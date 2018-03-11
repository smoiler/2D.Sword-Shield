package entity;

public class Reactor extends GameObject {

    private int incomeRate;
    private int income;
    private double cost;

    public int getIncomeRate() {
        return incomeRate;
    }

    public void setIncomeRate(int incomeRate) {
        this.incomeRate = incomeRate;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
