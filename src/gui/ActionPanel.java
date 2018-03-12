package gui;

import logic.GameManager;
import util.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class ActionPanel extends JPanel {

    private static final int DELAY = 100;

    private BufferedImage backgroundImage;
    private GameManager gameManager;
    private FileManager fileManager;
    private Timer timer;
    private JButton turnButton;
    private JButton pauseButton;
    private JLabel attackerScore;
    private JLabel defenderScore;
    private JLabel attackerGold;
    private JLabel defenderGold;
    private JLabel timeLeft;
    private JButton saveButton;
    private JPanel statsPanel;
    private JPanel utilityPanel;

    public ActionPanel() {
        fileManager = new FileManager();
        gameManager = new GameManager();
        backgroundImage = fileManager.getImage("/images/menu_bg.jpg");

        timer = new Timer(DELAY, iterateGameState -> {
            gameManager.update();

            attackerScore.setText("" + gameManager.getAttackerScore());
            defenderScore.setText("" + gameManager.getDefenderScore());
            attackerGold.setText("" + gameManager.getAttackerGold());
            defenderGold.setText("" + gameManager.getDefenderGold());
            timeLeft.setText("" + gameManager.getTimeLeft());
        });
        timer.start();

        attackerScore = new JLabel("" + gameManager.getAttackerScore());
        defenderScore = new JLabel("" + gameManager.getDefenderScore());
        attackerGold = new JLabel("" + gameManager.getAttackerGold());
        defenderGold = new JLabel("" + gameManager.getDefenderGold());
        timeLeft = new JLabel("" + gameManager.getTimeLeft());

        statsPanel = new JPanel();
        statsPanel.setLayout(new FlowLayout());
        statsPanel.add(attackerScore);
        statsPanel.add(attackerGold);
        statsPanel.add(timeLeft);
        statsPanel.add(defenderGold);
        statsPanel.add(defenderScore);


        turnButton = new JButton(">");
        pauseButton = new JButton("II");
        saveButton = new JButton("Save");
        utilityPanel = new JPanel();
        utilityPanel.setLayout(new FlowLayout());
        utilityPanel.add(pauseButton);
        utilityPanel.add(turnButton);
        utilityPanel.add(saveButton);

        setLayout(new BorderLayout());
        add(statsPanel, BorderLayout.NORTH);
        add(utilityPanel, BorderLayout.SOUTH);
        setPreferredSize(new Dimension(600, 600));
    }

    public GameManager getGameManager() {
        return gameManager;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(backgroundImage, 0, 0, null);
        // gameManager.render(g);
    }

}
