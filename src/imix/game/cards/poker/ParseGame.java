package imix.game.cards.poker;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mikhail_Kachanouski on 6/8/2016.
 */
public class ParseGame {
    //anchors
    private Map<String,BufferedImage> anchors;
    //games
    private List<Game> games=new ArrayList<Game>();


    public ParseGame() {
        this.anchors = new HashMap<String, BufferedImage>();
    }

    public ParseGame(Map<String, BufferedImage> anchors) {
        this.anchors = anchors;
    }

    /**
     * method for find ready
     * @param scree full screen
     * @param property - property for signal how many games and where it
     * @return do
     */
    public boolean isReady(BufferedImage screen, List<String> property){
        //вырезаем облости или ищем облости соответствующие якорям


        //если найдена управляющая область
        //то отправляем изображение на более детальную разборку
        return false;
    }


    /**
     * full parse data for game
     * @param partScreen - part screen for current game
     * @param game current game
     * @return do
     */
    public boolean fullParse(BufferedImage partScreen, Game game){

        return false;
    }











    public Map<String, BufferedImage> getAnchors() {
        return anchors;
    }

    public void setAnchors(Map<String, BufferedImage> anchors) {
        this.anchors = anchors;
    }
}
