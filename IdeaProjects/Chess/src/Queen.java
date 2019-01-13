public class Queen extends Piece
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
        else if(newPosition.column == this.column || newPosition.row == this.row)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
