package entity;

import util.Boundary;

import java.awt.*;

public class Tile extends GameObject{
    public Tile(){
        super();
    }
}

/**
    public void tileLocation(int loc){
        if(loc>400 || loc<=0)
            return;
        int line = loc/20;
        Point location = new Point((loc%20-1)*25+start.x, line*25+start.y);
    }

    public int findTileLocation(Point loc){
        int tileLoc = 0;
        int x,y;
        x = loc.x-start.x;
        x=x/25;
        x+=1;
        y=loc.y=start.y;
        int line = y/25;
        tileLoc = x+line*20;
        return tileLoc;
    }
 */
