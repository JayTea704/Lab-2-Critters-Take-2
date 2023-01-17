// Lion class sets movement, color, and string for Lion

import java.awt.*;

public class Lion extends Critter { // creates the Lion class
    private int counter;
    private Color initialColor;
    public Lion() {
        this.counter = 0;
    }
    public Action getMove(CritterInfo info) {
        // tell the lion actions and behavior
        if(info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        }
        else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        }
        else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        }
        else {
            return Action.HOP;
        }
    }
    public String toString() {
        return "L";
    }
    public Color getColor() { // sets color of lion
        this.counter = this.counter + 1;
        if ((this.counter - 1) % 3 == 0) {
            Color randomColor = getRandomColor();
            this.initialColor = randomColor;
            return randomColor;
        } else {
            return this.initialColor;
        }
    }
    private Color getRandomColor() {
        double number = Math.random();
        if (number < (1.0 / 3)) {
            return Color.RED;
        } else if (number > (2.0 / 3)) {
            return Color.GREEN;
        } else {
            return Color.BLUE;
        }
    }
}


