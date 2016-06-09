package by.imix.game.parser;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.Map;

/**
 * Class for parse screen and allocated zone for concrete game
 */
public class ParseScreen {
    //anchors
    private Map<String,BufferedImage> anchors;
    //games
    ParseGamePartyPoker parseGame;

    public ParseScreen() {

    }

    public ParseScreen(Map<String, BufferedImage> anchors, ParseGamePartyPoker parseGame) {
        this.anchors = anchors;
        this.parseGame=parseGame;
    }

    /**
     * method for find ready
     * @param screen full screen
     * @param property - property for signal how many games and where it
     * @return do
     */
    public boolean isReady(BufferedImage screen, List<String> property){
        //вырезаем облости или ищем облости соответствующие якорям


        //если найдена управляющая область
        //то отправляем изображение на более детальную разборку
        return false;
    }

    public Map<String, BufferedImage> getAnchors() {
        return anchors;
    }

    public void setAnchors(Map<String, BufferedImage> anchors) {
        this.anchors = anchors;
    }
}
