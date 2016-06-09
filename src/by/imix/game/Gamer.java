package by.imix.game;

import by.imix.game.cards.Card;

import java.util.List;

/**
 * Created by Mikhail_Kachanouski on 6/7/2016.
 */
public class Gamer {
    private List<Card> handCard;

    public List<Card> getHandCard() {
        return handCard;
    }

    public void setHandCard(List<Card> handCard) {
        this.handCard = handCard;
    }
}
