package gui;

import util.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CreditsPanel extends JPanel {

    private FileManager fileManager;
    private BufferedImage backgroundImage;
    private JLabel creditsTitle;
    private JLabel[] nameLabels;
    private JButton backButton;
    private final static String[] names = {"Mehmet Enes Keleş", "Akın Berkay Bal", "Eren Aslantürk", "Sadık Said Kasap"};

    public CreditsPanel() {
        fileManager = FileManager.getInstance();
        backgroundImage = fileManager.getImage("/images/menu/menu_bg.gif");
        creditsTitle = new JLabel("Credits");
        backButton = new JButton("Back");
        nameLabels = new JLabel[names.length];
        backButton.addActionListener(back -> {
            GUIManager.getInstance().showMenuPanel();
        });

        for (int i = 0; i < names.length; ++i)
            nameLabels[i] = new JLabel(names[i]);

        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(nameLabels[0])
                        .addComponent(nameLabels[1])
                        .addComponent(nameLabels[2])
                        .addComponent(nameLabels[3])
        );

        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(nameLabels[0])
                        .addComponent(nameLabels[1])
                        .addComponent(nameLabels[2])
                        .addComponent(nameLabels[3])
        );
        setLayout(new BorderLayout());
        add(creditsTitle, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        add(backButton, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(800, 600));
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage,0,0, null);
    }

}
