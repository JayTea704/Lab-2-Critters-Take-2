import java.awt.*;

public class Orca extends Critter{


    private Direction face;
    private boolean count;



    public Orca () {
        face = Direction.EAST;
        count = true;
    }

    public Color getColor(){
        return Color.BLUE;
    }

    public String toString(){

        return ">--:)";

    }

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
