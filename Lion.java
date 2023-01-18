// Lion class sets movement, color, and string for Lion

import java.awt.*;

public class Lion extends Critter { // creates the Lion class
    //initialize variables
    private int counter;
    private Color initialColor;
    
    public Lion() { //start counter at 0
        counter = 0;

    }
    
    public Action getMove(CritterInfo info) { // tells the lion actions and behavior
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
    //Returns character that represent the critter.
    public String toString() {
        return "L";
    }
    // sets color of lion
    public Color getColor() {
        this.counter = this.counter + 1;
        if ((this.counter - 1) % 3 == 0) { // checks if the lion needs to change color
            Color randomColor = getRandomColor();
            this.initialColor = randomColor;
            return randomColor;
        } else {
            return this.initialColor;
        }
    }
    // gets random color based off Math.random
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


