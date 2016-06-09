package by.imix.game.cards;

import by.imix.game.Game;

import java.util.List;

/**
 * Class for cards game
 */
public class CardsGame extends Game {
    private List<Card> tableCard; // table cards
    private Integer costBank; //money in BANK
    private Integer costColl;  // count money that need coll

    public List<Card> getTableCard() {
        return tableCard;
    }

    public void setTableCard(List<Card> tableCard) {
        this.tableCard = tableCard;
    }

    public Integer getCostBank() {
        return costBank;
    }

    public void setCostBank(Integer costBank) {
        this.costBank = costBank;
    }

    public Integer getCostColl() {
        return costColl;
    }

    public void setCostColl(Integer costColl) {
        this.costColl = costColl;
    }
}
