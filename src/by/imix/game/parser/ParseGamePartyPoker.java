package by.imix.game.parser;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mikhail_Kachanouski on 6/8/2016.
 */
public class ParseGamePartyPoker {

    private Game game;

    //anchors
    private Map<String,BufferedImage> anchors;
    //games
    private List<Game> games=new ArrayList<Game>();

    public ParseGamePartyPoker() {
        this.anchors = new HashMap<String, BufferedImage>();
    }

    public ParseGamePartyPoker(Map<String, BufferedImage> anchors) {
        this.anchors = anchors;
    }


    /**
     * full parse data for game
     * @param partScreen - part screen for current game
     * @param game current game
     * @return do
     */
    public boolean fullParse(BufferedImage partScreen){

        return false;
    }











    public Map<String, BufferedImage> getAnchors() {
        return anchors;
    }

    public void setAnchors(Map<String, BufferedImage> anchors) {
        this.anchors = anchors;
    }
}
