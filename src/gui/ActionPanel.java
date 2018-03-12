package gui;

import logic.GameManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionPanel extends JPanel {

    private GameManager gameManager;
    private Timer timer;
    private JButton turnButton;
    private JButton pauseButton;
    private JLabel attackerScore;
    private JLabel defenderScore;
    private JLabel timeLeft;
    private JButton saveButton;

    public ActionPanel() {
        turnButton = new JButton(">");
        pauseButton = new JButton("II");

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }

    private class ActionPanelHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

        }

    }
}
