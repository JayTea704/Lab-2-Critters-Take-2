import java.awt.*;
public class Giant extends Critter {
    // Counts how long each string is shown
    private int outerCount;
    // Counts and calls which string to be shown
    private int count;
    public Giant() {
        outerCount = 1;
        count = 0;

    }
    // Gives directions on what to do and where to go for critter
    public Color getColor (){

        return Color.GRAY;
    }
    // Decides what character(s) will be shown. Rotates between fee, fie, foe, fum.
    public String toString(){
        if(outerCount == 7){
            outerCount = 1;
            if(count == 3){
                count = 0;
            }
            else{
                count++;
            }

        }
        if(count == 0){
            outerCount++;
            return "fee";

        }
        else if(count == 1){
            outerCount++;
            return "fie";

        }
        else if(count == 2){
            outerCount++;
            return "foe";

        }
        else {
            outerCount++;
            return "fum";

        }


    }
    // Decides where critter will go and what it will do.
    public Action getMove(CritterInfo info){
        if(info.getFront() == Neighbor.OTHER){
            return Action.INFECT;
        }
        else if(info.getFront() == Neighbor.EMPTY){
            return Action.HOP;

        }
        else{
            return Action.RIGHT;
        }
    }

}
