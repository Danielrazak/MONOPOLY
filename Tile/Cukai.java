package Tile;

import java.util.Scanner;

public class Cukai {

    private String name;
    private float amountToPay;
    private String[] option;
    private int numberOfOption;

    public Cukai(String name, int numberOfOption, float amountToPay) {
        this.name = name;
        this.amountToPay = amountToPay;
        this.numberOfOption = numberOfOption;
        option = new String[numberOfOption];
    }

}
