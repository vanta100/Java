public class Rook extends Piece
{
    int row;
    int column;
    boolean isValidMove(Position newPosition){
        if(!super.isValidMove(position)){
            return false;
        }
        if(newPosition.column == this.column || newPosition.row == this.row){
            return true;
        }
        else{
            return false;
        }
    }
}
