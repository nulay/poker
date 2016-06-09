package by.imix.game.parser;

import by.imix.game.Game;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mikhail_Kachanouski on 6/8/2016.
 */
public class ParseGamePartyPoker extends ParseGame{


    //games
    private List<Game> games=new ArrayList<Game>();


    public ParseGamePartyPoker(Map<String, Anchor> anchors) {
        super(anchors);
    }


    /**
     * full parse data for game
     * @param partScreen - part screen for current game
     * @return do
     */
    public boolean fullParse(BufferedImage partScreen){

        return false;
    }


}
