package Tile;

import Main.MonopolyBoard;

import java.util.Scanner;

public class Tiles{
    String name;
    MonopolyBoard board;

    String[] option;
    int numberOfOption;

    public void setOption(int i) {
        Scanner scanner = new Scanner(System.in);
        char yesOrNo;
        if (option[i] != null) {
            System.out.println("Option " + i + " is already exist: " + option[i]);
            System.out.println("Overwrite?");
            System.out.println("[Y/N]");
            yesOrNo = scanner.nextLine().toUpperCase().charAt(0);
            switch (yesOrNo) {
                case 'Y' -> option[i] = scanner.nextLine();
            }
        } else {
            option[i] = scanner.nextLine();
        }
    }

    public void displayOption() {
        for (int i = 0; i < numberOfOption; i++) {
            if (option[i] != null) {
                System.out.println((i + 1) + ". " + option[i]);
            }
        }
    }

    public String[] getOption() {
        return option;
    }
    //Hello
}
