package problem2;

public class Pawn extends Piece {
    public Pawn(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        return b.getCol() == position.getCol() && b.getRow() == position.getRow() + 1;
    }
}