package Main;

import Tile.Tiles;

public class Pemain {

    private String name;
    private float money;
    private int currentTiles;
    private Tiles currentTilesType;
    private MonopolyBoard  board;
    private boolean prisoner;

    public Pemain(String name,float money,MonopolyBoard board){
        this.name = name;
        this.money = money;
        prisoner = false;
    }

    public void throwDice(){
        board.rollDice();
    }

    public void move(int toTiles){
        currentTiles = toTiles;
    }

    public Tiles getTiles(){
        currentTilesType = board.getTiles(currentTiles);
        return currentTilesType;
    }

    public void optionByTiles(){

    }
}
