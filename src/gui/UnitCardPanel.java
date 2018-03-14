package gui;
/*
* Author: Mehmet Enes Keles
* Date: 12.03.2018
*
* UnitCardPanel is simple card that represents a single unit such as a factory or a turret.
*/
import util.FileManager;
import javax.swing.*;
import java.awt.image.BufferedImage;

public class UnitCardPanel extends JPanel {
    private FileManager fileManager;
    private BufferedImage unitImage;
    private BufferedImage subUnitImage;
    private JLabel unitLabel;
    private JLabel subUnitLabel;
    private JLabel descriptionLabel;
    private JLabel costLabel;

    public UnitCardPanel(String unitDescription, int unitCost,String unitImagepath, String subUnitImagepath) {
        fileManager = FileManager.getInstance();
        System.out.println(unitImagepath + " " + subUnitImagepath);
        unitImage = fileManager.getImage(unitImagepath);

        // reactor doesn't have a sub unit / a unit that the reactor produces
        if (subUnitImagepath != null)
            subUnitImage = fileManager.getImage(subUnitImagepath);

        descriptionLabel = new JLabel(unitDescription);
        costLabel = new JLabel("" + unitCost);
        add(descriptionLabel);
        add(costLabel);
    }

    public void select() {

    }

    public void unselect() {

    }
}
