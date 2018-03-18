package logic.factory;

import entity.Tile;
import util.Boundary;
import util.FileManager;

import java.awt.image.BufferedImage;

public class TileFactory {
    private final static String[] IMAGEPATH = {"/images/tile/tile.gif", "/images/tile/htile.gif"};
    public final static int WIDTH = 50;
    public final static int HEIGHT = 50;

    public Tile createTile(int type, int x, int y) {
        Tile tile = new Tile();
        BufferedImage image = FileManager.getInstance().getImage(IMAGEPATH[type]);
        image = FileManager.getInstance().getResizedImage(image, WIDTH, HEIGHT);
        tile.setImage(image);
        tile.setBoundary(new Boundary(x, y, WIDTH, HEIGHT));
        return tile;
    }
}
