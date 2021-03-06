package gui;

import util.FileManager;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoadPanel extends JPanel {

    private JList list;
    private JButton selectButton;
    private JButton removeButton;
    private JLabel loadText;
    private DefaultListModel model;
    private JScrollPane pane;
    private ArrayList<String> savedGames;

    public LoadPanel() {
        setLayout(new BorderLayout());
        loadText = new JLabel("Load");
        model = new DefaultListModel();
        list = new JList(model);
        pane = new JScrollPane(list);
        savedGames = FileManager.getSavedGames();

        for (String savedGame : savedGames)
            model.addElement(savedGame);

        selectButton = new JButton("Select");
        selectButton.addActionListener( select -> {
            // TODO will be implemented after iteration I
            GUIManager.getInstance().showGamePanel();
        });

        removeButton = new JButton( "Remove");
        removeButton.addActionListener( remove -> {

        });

        add(pane, BorderLayout.NORTH);
       // add(pane, BorderLayout.CENTER);
        add(selectButton, BorderLayout.EAST);
        add(removeButton, BorderLayout.WEST);

        setPreferredSize(new Dimension(800, 600));
    }
}
