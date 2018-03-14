package gui;

import javax.swing.*;

public class StatsPanel extends JPanel {
    private JLabel attackerScore;
    private JLabel defenderScore;
    private JLabel attackerGold;
    private JLabel defenderGold;
    private JLabel timeLeft;

    public StatsPanel() {
        setLayout(null);
        setOpaque(false);
        attackerScore = new JLabel("" + 0);
        defenderScore = new JLabel("" + 0);
        attackerGold = new JLabel("" + 0);
        defenderGold = new JLabel("" + 0);
        timeLeft = new JLabel("" + 0);
    }

}
