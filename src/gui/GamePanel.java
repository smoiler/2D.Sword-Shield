package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GamePanel extends JPanel {
    private ActionPanel actionPanel;
    private UnitsPanel attackUnitsPanel;
    private UnitsPanel defenseUnitsPanel;

    public GamePanel() {
        setLayout(new BorderLayout());
        actionPanel = new ActionPanel();
        attackUnitsPanel = new UnitsPanel("Attack");
        defenseUnitsPanel = new UnitsPanel("Defense");

        add(attackUnitsPanel, BorderLayout.WEST);
        add(actionPanel, BorderLayout.CENTER);
        add(defenseUnitsPanel, BorderLayout.EAST);
    }

    private class GamePanelMouseHandler extends MouseAdapter {
        @Override
        public void mousePressed(MouseEvent e) {
             int mouseX = e.getX();
             int mouseY = e.getY();


        }
    }
}
