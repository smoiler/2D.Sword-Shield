package util;

import entity.GameObject;
import logic.GameManager;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    private static FileManager instance;

    private FileManager() {}

    public static FileManager getInstance() {
        if (instance == null)
            instance = new FileManager();
        return instance;
    }

    // TODO will be implemented after iteration I
    public static ArrayList<String> getSavedGames() {
        ArrayList<String> savedGames = new ArrayList<>();
        return savedGames;
    }

    // TODO will be implemented after iteration I
    public void removeSavedGame(int index) {

    }

    // TODO will be implemented after iteration I
    public GameManager loadGame(int loadGameIndex) {
        GameManager gameManager = new GameManager();

        return gameManager;
    }

    // TODO will be implemented after iteration I
    public void saveGame(GameManager gameManager) {

    }

    public BufferedImage getImage(String imagepath) {
        BufferedImage image;
        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagepath));
            return image;
        } catch (IOException exc) {
            System.err.println("getImage.IOException: " + imagepath);
            return null;
        } catch (IllegalArgumentException exc) {
            System.err.println("getImage.IllegalArgumentException: " + imagepath);
            return null;
        }
    }

    public static BufferedImage getResizedImage(BufferedImage image, int width, int height) {
        Image tempImage = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resultImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = resultImage.createGraphics();
        g2d.drawImage(tempImage, 0, 0, null);
        g2d.dispose();

        return resultImage;
    }
}
