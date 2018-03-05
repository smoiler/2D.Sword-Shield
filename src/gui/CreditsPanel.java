package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreditsPanel extends JPanel {

    private JLabel creditsTitle;
    private JLabel[] namesLabels;
    private JButton backButton;
    private final static String[] names = {"Mehmet Enes Keleş", "Akın Berkay Bal", "Eren Aslantürk", "Sadık Said Kasap"};

    public CreditsPanel() {
        creditsTitle = new JLabel("Credits");

        for (int i = 0; i < names.length; ++i)
            namesLabels[i] = new JLabel(names[i]);

        // ....
    }

    private class BackButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {

        }
    }
}
