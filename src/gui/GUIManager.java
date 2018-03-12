package gui;

import javax.swing.*;
import java.awt.*;

public class GUIManager {

    private static GUIManager instance;

    private JFrame frame;
    JPanel currentPanel;
    private MenuPanel menuPanel;
    private LoadPanel loadPanel;
    private CreditsPanel creditsPanel;
    private GamePanel gamePanel;

    // TODO will be implemented after iteration I.
    private int loadGameIndex;

    private GUIManager() {
        menuPanel = new MenuPanel();
        loadPanel = new LoadPanel();
        creditsPanel = new CreditsPanel();
        gamePanel = new GamePanel();

        frame = new JFrame("Sword&Shield: A Space Adventure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static GUIManager getInstance() {
        if (instance == null)
            instance = new GUIManager();
        return instance;
    }

    public void showMenuPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(menuPanel);
        frame.pack();    }

    public void showLoadPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(loadPanel);
        frame.pack();    }

    public void showCreditsPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(creditsPanel);
        frame.pack();
    }

    public void showGamePanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gamePanel);
        frame.pack();
    }

}
