package Main;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class GamePanel extends JPanel implements Runnable{
    final int tileSize = 16*3;

    final int maxScreenCol = 11, maxScreenRow = 11;
    final int screenWidth = tileSize*maxScreenCol, screenHeight = tileSize*maxScreenRow;

    JPanel northPanel, westPanel, eastPanel, southPanel;
    BufferedImage image;

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.GREEN);
        this.setDoubleBuffered(true);
        this.setLayout(new BorderLayout());

        northPanel = new JPanel(new GridLayout());
        northPanel.setOpaque(true);
        northPanel.setBackground(Color.WHITE);
        northPanel.setPreferredSize(new Dimension(tileSize*2, tileSize*2));
        this.add(northPanel, BorderLayout.NORTH);

        westPanel = new JPanel();
        westPanel.setOpaque(true);
        westPanel.setBackground(Color.BLUE);
        westPanel.setPreferredSize(new Dimension(tileSize*2, tileSize*2));
        this.add(westPanel, BorderLayout.WEST);

        eastPanel = new JPanel();
        eastPanel.setOpaque(true);
        eastPanel.setBackground(Color.BLACK);
        eastPanel.setPreferredSize(new Dimension(tileSize*2, tileSize*2));
        this.add(eastPanel, BorderLayout.EAST);

        southPanel = new JPanel();
        southPanel.setOpaque(true);
        southPanel.setBackground(Color.YELLOW);
        southPanel.setPreferredSize(new Dimension(tileSize*2, tileSize*2));
        this.add(southPanel, BorderLayout.SOUTH);
    }

    private void setGrid(){
        try {
            image = ImageIO.read(new File("src/resources/land.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        JLabel label = new JLabel((Icon) image);

        JPanel northGrid = new JPanel(new GridLayout());
        northGrid.setOpaque(true);
        northGrid.setBackground(Color.YELLOW);
        northGrid.setPreferredSize(new Dimension(tileSize, tileSize));
        northGrid.add(label);
        northGrid.add(label);
        northGrid.add(label);
        northGrid.add(label);
        northPanel.add(northGrid);
    }

    @Override
    public void run() {

    }
}
