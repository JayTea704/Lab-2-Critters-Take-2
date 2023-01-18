import java.awt.*;

public class JohnB extends Critter{
    // Decides what Color critter will be.
    public Color getColor(){
        return Color.PINK;
    }
    // Returns characters that represent critter.
    public String toString(){

        return ">--:)";

    }

    // Returns where critter will go and what it will do. Unique because if it sees another enemy it will turn the direction it sees the enemy.
    public Action getMove(CritterInfo info){
            if( info.getFront() == Neighbor.OTHER){
                return Action.INFECT;
            }
            else if( info.getLeft() == Neighbor.OTHER || info.getFront() == Neighbor.WALL || info.getFront() == Neighbor.SAME) {
                return Action.LEFT;
            }
            else if( info.getRight() == Neighbor.OTHER){
                return Action.RIGHT;
            }
            else{
                return Action.HOP;
            }



    }
}
