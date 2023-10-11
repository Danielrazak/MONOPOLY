package Main;

import javax.swing.*;

public class Main {
    static int dice;
    public static void main(String[] args) {
        JFrame window = new JFrame("DuitRia");
        GamePanel gamePanel = new GamePanel();

        //setup window
        window.setSize(1020,540);
        window.add(gamePanel);
        window.pack();
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}