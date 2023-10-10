package Main;

import Tiles.Tiles;

public class Penjara extends Tiles {

    private String[] option;
    private int numOfOption;
    MonopolyBoard board;

    public Penjara(int numOfOption, MonopolyBoard board) {
        this.name = "penjara";
        this.numOfOption = numOfOption;
        option = new String[numOfOption];
        for(int i=0;i<numOfOption;i++){
            option[i]="";
        }
    }

    public void setOption(int choice) {
        switch (choice){
            case 0:
                rollDiceToEscape();
                break;
            case 1:
                break;
        }
    }

    private void rollDiceToEscape(){
        board.rolldice();

        //roll dice
        if(board.dice1 == board.dice2){

        }
    }
}
