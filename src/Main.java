import gui.ActionPanel;
import gui.CreditsPanel;
import gui.GUIManager;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // GUIManager guiManager = new GUIManager();
        JFrame frame = new JFrame("Ali");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new ActionPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
