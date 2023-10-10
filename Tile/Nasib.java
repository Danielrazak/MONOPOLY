package Tile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Nasib extends Tiles{
    private int numOfFate;
    String fateList[];

    public Nasib(int numOfFate) {
        name = "fate";

        fateList = new String[numOfFate];
        loadData();
    }

    private void loadData(){
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader("/src/nasibLog.txt"));

            for(int i=0 ; i<numOfFate ; i++){
                fateList[i] = fileReader.readLine();
            }

            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int randomizedFate() {
        Random random = new Random();
        return random.nextInt(numOfFate);
    }

    public void fateHappened() {
        int fate = randomizedFate();

        int i=0;
        if(fate == i++){

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
        else if (fate == i++) {

        }
    }

}
