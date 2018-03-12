package gui;

import entity.Factory;
import entity.Reactor;
import entity.Turret;
import logic.factory.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UnitsPanel extends JPanel {
    private final int HEIGHT = 600;
    private final int WIDTH = 100;

    private UnitCardPanel[] unitCards;
    private int selected;
    private boolean show;

    public UnitsPanel(String type) {
        selected = -1;

        initUnitCards(type);

        for (int i = 0; i < unitCards.length; ++i)
            add(unitCards[i]);

        addMouseListener(new UnitsPanelMouseListener());
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    private void initUnitCards(String type) {
        // Initialize UnitsPanel with attack units
        if (type == "Attack") {
            int numOfFactories = FactoryFactory.DESCRIPTIONS.length;
            // +1 for 'Reactor' unit type
            unitCards = new UnitCardPanel[numOfFactories + 1];

            for (int i = 0; i < numOfFactories; ++i) {
                String description = FactoryFactory.DESCRIPTIONS[i];
                int cost = FactoryFactory.COSTS[i];
                String unitImagepath = FactoryFactory.IMAGEPATHS[i];
                String subUnitImagepath = SpaceshipFactory.IMAGEPATHS[i];
                unitCards[i] = new UnitCardPanel(description, cost, unitImagepath, subUnitImagepath);
            }
            String description = ReactorFactory.DESCRIPTION;
            int cost = ReactorFactory.COST;
            String unitImagepath = ReactorFactory.IMAGEPATH;
            unitCards[unitCards.length - 1] = new UnitCardPanel(description, cost, unitImagepath, null);

        } else { // Initialize UnitsPanel with defense units
            int numOfTurrets = TurretFactory.DESCRIPTIONS.length;
            unitCards = new UnitCardPanel[numOfTurrets];

            for (int i = 0; i < unitCards.length; ++i) {
                String description = TurretFactory.DESCRIPTIONS[i];
                int cost = TurretFactory.COSTS[i];
                String unitImagepath = TurretFactory.IMAGEPATHS[i];
                String subUnitImagepath = ProjectileFactory.IMAGEPATHS[i];

                unitCards[i] = new UnitCardPanel(description, cost, unitImagepath, subUnitImagepath);
            }
        }
    }


    public int getSelected() {
        return selected;
    }

    private class UnitsPanelMouseListener extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);
            int mouseY = e.getY();
            int mouseX = e.getX();

            if (mouseX > 0 && mouseX < WIDTH ) {
                int prevSelected = selected;
                selected = mouseY / (HEIGHT / unitCards.length) + 1;
                if (selected == prevSelected) {
                    selected = -1;
                    unitCards[prevSelected].unselect();
                }
                else
                    unitCards[selected].select();
            }

            else if (selected != -1) {
                unitCards[selected].unselect();
                selected = -1;
            }
        }
    }

}
