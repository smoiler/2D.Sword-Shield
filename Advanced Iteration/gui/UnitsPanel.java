package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

public class UnitsPanel extends JPanel {

    private JLabel unitsTitle;
    private JLabel unitDescriptions;
    private BufferedImage[] unitImages;
    private int selected;
    private int show;

    public UnitsPanel(String type) {
        // Initialize UnitsPanel with attack units
        if (type == "Attack") {

        } else { // Initialize UnitsPanel with defense units

        }
    }
    private class UnitsPanelHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    }
}
