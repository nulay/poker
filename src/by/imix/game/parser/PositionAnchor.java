package by.imix.game.parser;

/**
 * Created by Mikhail_Kachanouski on 6/9/2016.
 */
public class PositionAnchor implements Anchor{
    private int top;
    private int left;

    public int getY() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }

    public int getX() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}
