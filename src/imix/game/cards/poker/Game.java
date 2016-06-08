package imix.game.cards.poker;

import java.util.List;

/**
 * Created by Mikhail_Kachanouski on 6/7/2016.
 */
public class Game {
    private Gamer gamer; // gamer
    private List<Card> tableCard; // table cards
    private StateGame stateGame; //state game
    private Integer position; //position gamer
    private Integer costBank; //money in BANK
    private Integer costColl;  // count money that need coll

    /**
     * Method that have some action
     * @param actionGame action game
     */
    public void fire(ActionGame actionGame){
        actionGame.handle(this);
    }

    
























    public Gamer getGamer() {
        return gamer;
    }

    public void setGamer(Gamer gamer) {
        this.gamer = gamer;
    }

    public List<Card> getTableCard() {
        return tableCard;
    }

    public void setTableCard(List<Card> tableCard) {
        this.tableCard = tableCard;
    }

    public StateGame getStateGame() {
        return stateGame;
    }

    public void setStateGame(StateGame stateGame) {
        this.stateGame = stateGame;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
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
