public class Bishop extends Piece
{
    int row;
    int column;
    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)){
            return true;
        }
        else{
            return false;
        }
    }
}
