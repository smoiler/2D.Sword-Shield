package gui;

/* Author: Mehmet Enes Keles
 * Date: 12.03.2018
 *
 * ActionPanel is the UI component that carries the GameManager. Main flow of events are shown through ActionPanel.
 * These events include movement of the game objects, change in score and gold, change in remaining time.
 */

import logic.GameManager;
import util.FileManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class ActionPanel extends JPanel {

    // TODO a custom cursor for the game might be added after iteration I
    // private static final int MOUSE_WIDTH = 40;
    // private static final int MOUSE_HEIGHT = 40;

    private int mouseX, mouseY;


    public ActionPanel() {
        setLayout(null);
        setOpaque(false);
        setPreferredSize(new Dimension(500, 600));
        addMouseListener(new ActionPanelMouseListener());
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // TODO gameManager.render(g);
    }

    private class ActionPanelMouseListener extends MouseAdapter {
        @Override
        public void mouseMoved(MouseEvent e) {
            super.mouseMoved(e);
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

}
