package gui;

import util.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class MenuPanel extends JPanel {

    private BufferedImage gameLogo;
    private BufferedImage backgroundImage;

    private FileManager fileManager;
    private JButton playButton;
    private JButton loadButton;
    private JButton creditsButton;
    private JButton soundButton;



    public MenuPanel() {
        fileManager = new FileManager();
        backgroundImage = fileManager.getImage("/images/menu_bg.jpg");

        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        playButton = new JButton("Play");
        playButton.addActionListener(play -> {

        });

        loadButton = new JButton("Load");
        loadButton.addActionListener(load -> {

        });

        creditsButton = new JButton("Credits");
        creditsButton.addActionListener(credits -> {

        });

        soundButton = new JButton("Sound On/Off");
        soundButton.addActionListener(sound-> {

        });

        add(playButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(loadButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(creditsButton);
        add(Box.createRigidArea(new Dimension(0, 10)));
        add(soundButton);

        setPreferredSize(new Dimension(800, 600));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
    }
}
