import java.awt.*;
public class Bear extends Critter {
    // boolean for color
    private boolean polar;
    // boolean for alternating string
    private boolean slash;
    public Bear (boolean polar){
        this.polar = polar;
        slash = true;
    }
    // Gives directions on what to do and where to go for critter
    public Action getMove (CritterInfo info) {

        slash = !slash;

        if (info.getFront() == Neighbor.OTHER) {

            return Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY) {

            return Action.HOP;
        }
        else {
            return Action.LEFT;
        }
    }
    // Gives directions on which color to be
    public Color getColor() {

        if(polar) {
            return Color.WHITE;
        }
        else {
            return Color.BLACK;
        }
    }
    // Gives directions on what character critter will be
    public String toString() {
        if (slash) {
            return "/";
        }
        else {
            return "\\";
        }
    }


}
