package Tile;

import java.util.Random;

public class Nasib extends Tiles{
    private int numOfFate;

    public Nasib(int numOfFate) {
        name = "fate";
        this.numOfFate = numOfFate;
    }

    public int randomizedFate() {
        Random random = new Random();
        return random.nextInt(numOfFate);
    }

    public void fateHappened() {

    }
}
