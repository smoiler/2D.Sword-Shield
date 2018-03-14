package gui;
/*
* Author: Mehmet Enes Keles
* Date: 12.03.2018
*
* UnitCardPanel is simple card that represents a single unit such as a factory or a turret.
*/
import util.FileManager;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class UnitCardPanel extends JPanel {
    public static final int WIDTH = 150;
    public static final int HEIGHT = 120;

    private boolean selected;
    private String unitName;
    private String subUnitName;
    private int unitCost;

    private BufferedImage unitImage;
    private BufferedImage subUnitImage;

    public UnitCardPanel(String unitName, String subUnitName, int unitCost, String unitImagepath, String subUnitImagepath) {
        selected = false;

        this.unitName = unitName;
        this.subUnitName = subUnitName;

        this.unitCost = unitCost;

        unitImage = FileManager.getInstance().getImage(unitImagepath);

        // reactor doesn't have a sub unit
        if (subUnitImagepath != null)
            subUnitImage = FileManager.getInstance().getImage(subUnitImagepath);

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setBackground(Color.BLACK);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(unitImage, 10, 10, null);
        if (subUnitImage != null)
            g.drawImage(unitImage, 10, 80, null);

        g.setFont(new Font("Helvetica", Font.PLAIN, 10));
        g.setColor(Color.RED);
        g.drawString(unitName,60,10);

        if (subUnitName != null)
            g.drawString(subUnitName, 60, 80);

        g.setColor(Color.BLUE);
        g.drawRect(1, 1, WIDTH - 2, HEIGHT - 2);

    }

    public void unselect() {

    }
}
