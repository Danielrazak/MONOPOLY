package Tile;

import Main.MonopolyBoard;

public class TilesManager {
    Tiles[] tileList;
    MonopolyBoard board;


    public TilesManager(MonopolyBoard board) {
        tileList = new Tiles[40];
    }

    private void setupTiles(){
        //TODO: setup semua tiles according to properties

        //contoh. Buat sampai tileList[39]
        tileList[0] = new Tanah(board, "KLCC", 100, 10);
    }
}
