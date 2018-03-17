package logic;

import com.sun.deploy.util.ArrayUtil;
import util.Boundary;
import entity.Tile;

import java.util.ArrayList;

import java.awt.*;

public class TileManager{
    private Boundary til;
    private Tile tile;
    private ArrayList attackerTiles;
    private ArrayList defenderTiles;
    private ArrayList roadTiles;
    private Boundary roadStart,roadEnd;
    final private int[] XCOORD = {150,300,500,650};
    final private int[] YCOORD = {200,275,325,400};

    public void initTiles(){
        for(int i = 1;i<=400;i++)
            tile.tileLocation(i);
    }
    public void defenderTiles(Point moment){
        int i = 0;
        while (moment.x>=XCOORD[0] && moment.x<=XCOORD[1]){
            while((moment.y>=YCOORD[0] && moment.y<=YCOORD[1]) ||
                    (moment.y>=YCOORD[2] && moment.y<=YCOORD[3]) ){
                        defenderTiles.add(i,moment);
                        i++;
            }
        }
    }

    public void attackerTiles(Point moment){
        int j = 0;
        while (moment.x>=XCOORD[2] && moment.x<=XCOORD[3]){
            while((moment.y>=YCOORD[0] && moment.y<=YCOORD[1]) ||
                    (moment.y>=YCOORD[2] && moment.y<=YCOORD[3]) ){
                    attackerTiles.add(j,moment);
                    j++;
            }
        }
    }
    public void roadTiles(Point moment){
        int k = 0;
        while (moment.x>=XCOORD[0] && moment.x<=XCOORD[3]){
            while(moment.y>YCOORD[1] && moment.y<YCOORD[2] ){
                roadTiles.add(k,moment);
                k++;
            }
        }
    }
}
