package Main;

import java.util.Random;

public class MonopolyBoard {
    int dice1, dice2;
    Random randomizer = new Random();

    public void rolldice(){
        dice1 = randomizer.nextInt(1, 7);
        dice2 = randomizer.nextInt(1, 7);
    }
}
