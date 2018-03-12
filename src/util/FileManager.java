package util;

import entity.GameObject;
import logic.GameManager;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

    public static ArrayList<String> getSavedGames() {
        ArrayList<String> savedGames = new ArrayList<>();
        savedGames.add("dummysavedgame 1");
        savedGames.add("dummysavedgame 2");
        savedGames.add("dummysavedgame 3");
        savedGames.add("dummysavedgame 4");
        return savedGames;
    }

    public void removeSavedGame(int index) {

    }

    // TODO will be implemented after iteration I
    public GameManager loadGame(int loadGameIndex) {
        GameManager gameManager = new GameManager();
        return gameManager;
    }

    public void saveGame(GameManager gameManager) {

    }

    public BufferedImage getImage(String imagepath) {
        BufferedImage image;
        try {
            image = ImageIO.read(getClass().getResourceAsStream(imagepath));
            return image;
        } catch (IOException exc) {
            exc.printStackTrace();
            return null;
        }
    }
}
