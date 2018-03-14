package logic;

import util.Boundary;
import entity.Tile;

import java.util.ArrayList;

import java.awt.*;

public class TileManager{
    private Boundary til;
    private Tile tile;
    private Point[] attackerBorders;
    private Point defenderBorders;
    private Boundary roadStart,roadEnd;
    final private int[] XCOORD = {150,300,500,650};
    final private int[] YCOORD = {200,275,325,400};

    public void initTiles(){
        for(int i = 1;i<=400;i++)
            tile.tileLocation(i);
    }
    public void defenderTiles(Point moment){

        while (moment.x>=XCOORD[0] && moment.x<=XCOORD[1]){
            while((moment.y>=YCOORD[0] && moment.y<=YCOORD[1]) ||
                    (moment.y>=YCOORD[2] && moment.y<=YCOORD[3]) ){

            }
        }
    }

    public void attackerTiles(Point moment){

        while (moment.x>=XCOORD[2] && moment.x<=XCOORD[3]){
            while((moment.y>=YCOORD[0] && moment.y<=YCOORD[1]) ||
                    (moment.y>=YCOORD[2] && moment.y<=YCOORD[3]) ){

            }
        }
    }
    public void roadTiles(Point moment){

        while (moment.x>=XCOORD[0] && moment.x<=XCOORD[3]){
            while(moment.y>YCOORD[1] && moment.y<YCOORD[2] ){

            }
        }
    }
}
