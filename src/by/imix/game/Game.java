package by.imix.game;


import by.imix.game.cards.poker.StateGame;

/**
 * Class for other game
 */
public abstract class Game {
    private Gamer gamer; // gamer
    private StateGame stateGame; //state game
    private Integer position; //position gamer


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
}
