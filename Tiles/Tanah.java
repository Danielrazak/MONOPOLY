package Tiles;

public class Tanah {
    private String option[];
    private int numOfOption;
    String owner, name;
    int price, rent, house;
    boolean isOccupied;

    public Tanah(String name, int price, int rent) {
        this.price = price;
        this.rent = rent;
        this.name = name;
    }

    public void buy(String player){
        owner = player;
        isOccupied = true;
        //duit player berkurang
    }

    public void sell(){
        //duit player bertambah
        isOccupied = false;
        owner = null;
    }

    public void rent(String player){
        if(!player.equals(owner)){
            //player kena bayar rent
        }
    }

    public void buildHouse(int num){
        if((house += num) <= 4){
            //player boleh beli rumah
            house++;
            //duit player berkurang
        }
    }
}
