package Tiles;

public class Tanah {
    private String option[];
    private int numOfOption;
    String owner, name;
    int price, rent;

    public Tanah(String name, int price, int rent) {
        this.price = price;
        this.rent = rent;
        this.name = name;
    }
}
