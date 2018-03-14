package logic;

import util.Boundary;

import java.awt.*;

public class TileManager {
    private Boundary tile;

    private Boundary[] attackerBordersStart;
    private Boundary[] defenderBordersStart;
    private Boundary roadStart,roadEnd;


    public void initTiles(){
        Point start = new Point(150,275);
        roadStart.setLocation(start);
        Point end = new Point(150,325);
        roadEnd.setLocation(end);
    }
}
