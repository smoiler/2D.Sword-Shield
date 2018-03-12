package gui;

import javax.swing.*;

public class GUIManager {

    private JFrame frame;
    private MenuPanel menuPanel;
    private LoadPanel loadPanel;
    private CreditsPanel creditsPanel;
    private GamePanel gamePanel;

    // TODO will be implemented after iteration I.
    private int loadGameIndex;

    public GUIManager() {
        menuPanel = new MenuPanel();
        loadPanel = new LoadPanel();
        creditsPanel = new CreditsPanel();
        gamePanel = new GamePanel();

        frame = new JFrame("Sword&Shield: A Space Adventure");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(menuPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private void showMenuPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(menuPanel);
    }

    private void showLoadPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(loadPanel);
    }

    private void showCreditsPanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(creditsPanel);
    }

    private void showGamePanel() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(gamePanel);
    }

}
