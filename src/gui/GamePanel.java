package gui;

import logic.GameManager;
import util.FileManager;

import javax.rmi.CORBA.Util;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    private static final int DELAY = 100;

    private static GamePanel instance;
    private BufferedImage backgroundImage;
    private ActionPanel actionPanel;
    private UnitsPanel attackUnitsPanel;
    private UnitsPanel defenseUnitsPanel;
    private StatsPanel statsPanel;
    private UtilityPanel utilityPanel;
    private GameManager gameManager;
    private Timer timer;

    private GamePanel() {
        setLayout(null);
        backgroundImage = FileManager.getInstance().getImage("/images/gamepanel/bg.png");
        gameManager = new GameManager();
        actionPanel = new ActionPanel();
        attackUnitsPanel = new UnitsPanel("Attack");
        attackUnitsPanel.setBounds(new Rectangle(0, 0, UnitsPanel.WIDTH, UnitsPanel.HEIGHT));
        defenseUnitsPanel = new UnitsPanel("Defense");
        defenseUnitsPanel.setBounds(new Rectangle(650, 0, 150, 600));
        statsPanel = new StatsPanel();
        statsPanel.setBounds(new Rectangle(200, 0, StatsPanel.WIDTH, StatsPanel.HEIGHT));
        utilityPanel = new UtilityPanel();
        utilityPanel.setBounds(200, 550, UtilityPanel.WIDTH, UtilityPanel.HEIGHT);

        // set timer
        timer = new Timer(DELAY, iterateGameState -> {
            //gameManager.update();
        });
        timer.start();
        addMouseListener(new GamePanelMouseHandler());
        add(attackUnitsPanel);
        add(defenseUnitsPanel);
        add(actionPanel);
        add(utilityPanel);
        add(statsPanel);

        setPreferredSize(new Dimension(800, 600));
    }

    public static GamePanel getInstance() {
        if (instance == null)
            instance = new GamePanel();
        return instance;
    }

    protected void paintComponent(Graphics g) {
        g.drawImage(backgroundImage, 150, 0, null);
    }

    private class GamePanelMouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
             int mouseX = e.getX();
             int mouseY = e.getY();
        }
    }


}
