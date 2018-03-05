package gui;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseManager extends MouseAdapter {

    private int mouseX, mouseY;

    public MouseManager() {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e);
    }

    public int getMouseX() {
        return mouseX;
    }

    public int getMouseY() {
        return mouseY;
    }
}

