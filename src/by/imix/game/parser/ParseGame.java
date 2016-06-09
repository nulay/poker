package by.imix.game.parser;


import by.imix.game.Game;

import java.awt.image.BufferedImage;
import java.util.Map;

/**
 * Created by Mikhail_Kachanouski on 6/9/2016.
 */
public abstract class ParseGame {
    private Game game;
    private int screenWidth;
    private int getScreenHeight;
    //anchors
    private Map<String,Anchor> anchors;

    public ParseGame(Map<String, Anchor> anchors) {
        this.anchors=anchors;
    }


    abstract boolean fullParse(BufferedImage partScreen);

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(int screenWidth) {
        this.screenWidth = screenWidth;
    }

    public int getGetScreenHeight() {
        return getScreenHeight;
    }

    public void setGetScreenHeight(int getScreenHeight) {
        this.getScreenHeight = getScreenHeight;
    }

    public Map<String, Anchor> getAnchors() {
        return anchors;
    }

    public void setAnchors(Map<String, Anchor> anchors) {
        this.anchors = anchors;
    }
}
