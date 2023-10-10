package Tile;

import Main.MonopolyBoard;

public class Penjara extends Tiles {

    private String[] option;
    private int numOfOption;

    public Penjara(int numOfOption, MonopolyBoard board) {
        name = "penjara";
        this.board = board;
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
        board.rollDice();

        //roll dice
        if(board.dice1 == board.dice2){

        }
    }
}
