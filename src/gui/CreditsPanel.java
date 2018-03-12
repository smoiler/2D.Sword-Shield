package gui;

import util.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class CreditsPanel extends JPanel {

    private FileManager fileManager;
    private BufferedImage backgroundImage;
    private JLabel creditsTitle;
    private JLabel[] nameLabels;
    private JButton backButton;
    private final static String[] names = {"Mehmet Enes Keleş", "Akın Berkay Bal", "Eren Aslantürk", "Sadık Said Kasap"};

    public CreditsPanel() {
        fileManager = new FileManager();
        backgroundImage = fileManager.getImage("/images/menu_bg.jpg");
        creditsTitle = new JLabel("Credits");
        backButton = new JButton("Back");
        nameLabels = new JLabel[names.length];
        backButton.addActionListener(back -> {
            GUIManager.getInstance().showMenuPanel();
        });

        for (int i = 0; i < names.length; ++i)
            nameLabels[i] = new JLabel(names[i]);

        add(creditsTitle);

        for(JLabel label : nameLabels)
            add(label);

        add(backButton);

        setPreferredSize(new Dimension(800, 600));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage,0,0, null);
    }

}
