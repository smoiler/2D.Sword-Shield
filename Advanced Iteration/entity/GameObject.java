package entity;

import util.Boundary;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class GameObject {

    private Boundary boundary;
    private BufferedImage image;
    private double cost;

    public Boundary getBoundary() {
        return boundary;
    }

    public void setBoundary(Boundary boundary) {
        this.boundary = boundary;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
