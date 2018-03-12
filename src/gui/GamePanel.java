package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    private ActionPanel actionPanel;
    private UnitsPanel attackUnitsPanel;
    private UnitsPanel defenseUnitsPanel;
    private MouseManager mouseManager;

    public GamePanel() {
        mouseManager = new MouseManager();
        actionPanel = new ActionPanel();
        attackUnitsPanel = new UnitsPanel("Attack");
        defenseUnitsPanel = new UnitsPanel("Defense");

    }
}
