package Main;

import java.util.Random;

public class Nasib {

    private String name;
    private int numOfFate;

    public Nasib(String name, int numOfFate) {
        this.name = name;
        this.numOfFate = numOfFate;
    }

    public int randomizedFate() {
        Random random = new Random();
        return random.nextInt(numOfFate);
    }

    public void fateHappened() {

    }

}
