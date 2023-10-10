package Tile;

import Main.MonopolyBoard;

public class Tanah extends Tiles{
    String placeName, owner;
    int price, rent, house;
    boolean isOccupied;

    public Tanah(MonopolyBoard board, String location, int price, int rent) {
        name = "land";
        this.board = board;
        placeName = location;
        this.price = price;
        this.rent = rent;
    }

    public void buy(String player){
        owner = player;
        isOccupied = true;
        //TODO: duit player berkurang
    }

    public void sell(){
        //TODO: duit player bertambah
        isOccupied = false;
        owner = null;
    }

    public void rent(String player){
        if(!player.equals(owner)){
            //TODO: player kena bayar rent
        }
    }

    public void buildHouse(int num){
        if((house += num) <= 4){
            //TODO: player boleh beli rumah
            house++;
            //duit player berkurang
        }
    }
}
