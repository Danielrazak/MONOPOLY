package Main;

import Tile.Tiles;

import java.util.Random;

public class MonopolyBoard {
    public int dice1, dice2;
    Random randomizer = new Random();

    public void rollDice(){
        dice1 = randomizer.nextInt(1, 7);
        dice2 = randomizer.nextInt(1, 7);
    }

    public Tiles getTiles(int tileNumber){
        //TODO
        return null;
    }
}
