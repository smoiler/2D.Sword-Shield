package entity;

import util.Boundary;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class GameObject {

    public Boundary boundary;
    private BufferedImage image;
    public Tile tile;

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
}
